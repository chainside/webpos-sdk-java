def required_field(schema):
    return 'required' in schema['rules'] if 'rules' in schema else False

TESTS = {'required_field' : required_field}