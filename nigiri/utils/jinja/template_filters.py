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

FILTERS = {'classname': classname ,
            'request_body_class' : request_body_class,
            'response_body_class' : response_body_class}
