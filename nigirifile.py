class SdkObjectsGenerator(Generator):
    def run(self, parsed):
        for endpoint in parsed.endpoints:
            self.generate('action.nigiri.java', 'src/main/java/org/webpossdk/actions/{}'.format(endpoint.namespace.title().replace("_", "") + "Action"), endpoint=endpoint,
                          errors_dict=parsed.errors)
        for obj in parsed.objects:
             self.generate('object.nigiri.java', 'src/main/java/org/webpossdk/objects/{}'.format(obj.raw_name.title().replace("_", "")), object=obj)
Generator = SdkObjectsGenerator
