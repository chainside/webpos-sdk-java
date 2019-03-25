class SdkObjectsGenerator(Generator):
    def run(self, parsed):
        for endpoint in parsed.endpoints:
            self.generate('action.nigiri.java', 'src/main/java/org/webpossdk/actions/{}'.format(endpoint.namespace.title().replace("_", "") + "Action"), endpoint=endpoint,
                          errors_dict=parsed.errors)
        for obj in parsed.objects:
             self.generate('object.nigiri.java', 'src/main/java/org/webpossdk/objects/{}'.format(obj.raw_name.title().replace("_", "")), object=obj)
             self.generate('object.schema.nigiri.java', 'src/main/java/org/webpossdk/objects/schemas/{}'.format(obj.raw_name.title().replace("_", "")) +  "Schema",
             object=obj)
             if "Response" not in obj.raw_name.title().replace("_", ""):
                self.generate('collection.nigiri.java', 'src/main/java/org/webpossdk/objects/{}'.format(obj.raw_name.title().replace("_", "") + "Collection"), object=obj)
        for error in parsed.errors:
            self.generate('exception.nigiri.java', 'src/main/java/org/webpossdk/exceptions/{}'.format('{}{}'.format(error.name.title().replace(' ', ''), 'Exception')), error=error)
        for callback in parsed.callbacks:
            self.generate('callback.nigiri.java','src/main/java/org/webpossdk/objects/{}'.format(callback.event_type.title().replace('.', '') + "Callback"), callback=callback)
            self.generate('callback.schema.nigiri.java', 'src/main/java/org/webpossdk/objects/schemas/{}'.format(callback.object_name.title().replace("_", "")) + "Schema", callback=callback)
        self.generate('factory.nigiri.java', 'src/main/java/org/webpossdk/actions/ChainsideActionFactory', endpoints=parsed.endpoints)
        self.generate('client.nigiri.java', 'src/main/java/org/webpossdk/api/ChainsideClient', endpoints=parsed.endpoints)
        self.generate('callback.factory.nigiri.java', 'src/main/java/org/webpossdk/callbacks/ChainsideCallbackFactory', callbacks=parsed.callbacks)
        self.generate('readme.nigiri.md', 'README', endpoints=parsed.endpoints, objects=parsed.objects, callbacks=parsed.callbacks)
Generator = SdkObjectsGenerator
