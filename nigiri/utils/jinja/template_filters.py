import json

def classname(namespace):
    return namespace.title().replace('_', '')

def request_body_class(endpoint):
    if endpoint.request.body_params:
        return classname(endpoint.request.body_params.raw_name)
    return None


def response_body_class(endpoint):
    if endpoint.response.body_params:
        return classname(endpoint.response.body_params.raw_name)
    return None

def request_return_type(endpoint):
    return response_body_class(endpoint) or "void"

def is_object_type(schema_dict):
    return schema_dict['type'].startswith("object(")


def is_array_type(schema_dict):
    return schema_dict['type'].startswith("array[")

def get_j_type(type):
    if type.startswith("array["):
        return "{}Collection".format(classname(type.replace("array[" , "").replace("]", "")));
    elif type.startswith("object"):
        return classname(type.replace("object(" , "").replace(")", ""))
    TYPES = {
            "uuid" : "String",
            "boolean" : "Boolean",
            "integer" : "Integer",
            "string" : "String",
            "email" : "String",
            "ISO_8601_date" : "String",
            "base64" : "String",
            "base58" : "String",
            "url" : "String",

    }

    return TYPES[type]

def params_to_readme_args(endpoint):
    params = []
    if endpoint.request.uri_params:
        for k, v in endpoint.request.uri_params.items():
            params.append('{}:{}'.format(camel_case(k), v['type']))
    if endpoint.request.query_params:
        for k, v in endpoint.request.query_params.items():
            params.append('{}:{}'.format(camel_case(k), v['type']))
    if endpoint.request.body_params:
        params.append('{}:{}'.format(camel_case(request_body_class(endpoint)), request_body_class(endpoint)))
    return ','.join(params)

def readme_parameter_type(schema):
    if schema["type"].startswith('object'):
        obj_slug = schema["type"].replace('object(', '').replace(')', '')
        obj_name = obj_slug.title().replace('_', '')
        return "[{}](#{})".format(obj_name, obj_slug.replace('_', ''))
    elif schema["type"].startswith('array['):
        classname_ = classname(schema["type"].replace('array[', '').replace(']', ''))
        return "[[{}](#{})]".format(classname_, classname_)
    else:
        return PRIMITIVE_TYPES_MAPPING[schema["type"].lower()]

def camel_case(st):
    output = ''.join(x for x in st.title() if x.isalnum())
    return output[0].lower() + output[1:]

def error_classname(error):
    return '{}{}'.format(error.name.title().replace(' ', ''), 'Exception')


def params_to_init(endpoint):
    params = []
    if endpoint.request.uri_params:
        for k in endpoint.request.uri_params:
            params.append('String ' + camel_case(k))
    if endpoint.request.query_params:
        for k in endpoint.request.query_params:
            params.append('String ' + camel_case(k))
    if endpoint.request.body_params:
        params.append(request_body_class(endpoint) + " " + camel_case(endpoint.request.body_params.raw_name))
    return ','.join(params)

def filter_descriptions(schema):
    res = {}
    for key in schema:
        if key == 'description' and 'rules' in schema:
            continue
        if isinstance(schema[key], dict):
            res[key] = filter_descriptions(schema[key])
        else:
            res[key] = schema[key]
    return res

def callback_object_name(callback):
    return callback.object_name.title().replace('_', '')

def action_name(endpoint):
    return endpoint.namespace.title().replace('_', '')

PRIMITIVE_TYPES_MAPPING = {
    'array': 'array',
    'base58': 'string',
    'base64': 'string',
    'base64_encoded_file': 'string',
    'boolean': 'bool',
    'data': 'string',
    'email': 'string',
    'float': 'float',
    'integer': 'integer',
    'iso_8601_date': 'string',
    'object': 'array',
    'sequence': 'array',
    'url': 'string',
    'string': 'string',
    'uuid': 'string'
}

FILTERS = {'classname': classname ,
           'request_body_class' : request_body_class,
           'response_body_class' : response_body_class,
           'is_object_type' : is_object_type,
           'is_array_type' : is_array_type,
           'get_j_type' : get_j_type,
           'camel_case' : camel_case,
           'request_return_type' : request_return_type,
           'error_classname' : error_classname,
           'params_to_init' : params_to_init,
           'filter_descriptions' : filter_descriptions,
           'readme_parameter_type' : readme_parameter_type,
           'params_to_readme_args' : params_to_readme_args,
           'callback_object_name' : callback_object_name,
           'action_name' : action_name
           }
