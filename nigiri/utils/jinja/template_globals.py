import json

def jsondumps(dict_):
    return json.dumps(dict_)


GLOBALS = {'print' : print,
           'jsondumps' : jsondumps  }