<p>
<img src="https://www.chainside.net/wp-content/themes/chainside2018/assets/favicon//favicon-192.png" alt="chainside" width="80">
<br \><br \>
developed with :heart: by <a href="https://www.chainside.net">chainside</a>
</p>


<!-- START doctoc -->
<!-- END doctoc  -->

# Introduction

This project is the **official** SDK library for the integration with the [Chainside Pay]() Platform.
It is an extension of the [Sdk-boilerplate]() library.
 
# Installation

Follow these steps to install the SDK library into your system:

{% include 'readme/installation.nigiri.md' %}

# Structure

The following sections will describe the high level structure of the
SDK library.

## Configuration

In order to be able to configure your SDK client you have to set some
configuration parameters. Here is the list of the configuration parameters
used by the library:

| Parameter | Type | Required | Default | Description |
|-----------|------|----------|---------|-------------|
| **mode** | _string_ | Yes | `live` | The SDK mode, can be `sandbox` or `live` |
| **clientId** | _string_ | Yes | `null` | Your WebPos client id |
| **secret** | _string_ | Yes | `null` | Your WebPos secret |


## Client

The Library exposes a _client_ object which is instantiated with the system configuration and
provides an high-level interface to send requests. Client's instances take care of compiling and
sending http request and parse responses into [SdkObject](#Objects) instances. 

## Objects

The library defines an SdkObject class which is extended by actual objects which represent Chainside-Pay
API requests and response bodies. Every json object defined in the API has a corresponding SdkObject
class which is either the input of a _client_ instance method (for creation) or returned (for reading)

## Callbacks

Callbacks are requests sent by the server to your application in order to notify about some events. 
Every callback is sent **only to HTTPS** webhooks and will be securely signed by the server in order to be verified.

# Usage

The following sections will describe how to use the SDK library and
all the detail needed to integrate your business with Chainside Pay.

## Instantiate and use the client

In order to communicate with our backend first you need to instantiate
the client:

{% include 'readme/examples/client.nigiri.md' %}


Once the client is instantiated and configured, you can use the following
methods to send requests:


| Method |
|--------|
{% include 'readme/examples/client-methods.nigiri.md' %}

## Objects

{% for object in objects -%}
### {{ object.name }}

{{ object.description }}

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
{% for parameter, spec in object.schema -%}
| {{ parameter }} | _{{ spec|readme_parameter_type }}_ | {{ "Yes" if spec is required_field else "No" }} | {{ spec.description }} |
{% endfor %}

{% endfor %}


## Callbacks

Chainside will send callbacks if some event is triggered regarding one of your assets registered on the Business Panel.
Our server will send a request to your webhooks that you need to parse and verify. You can do this using this SDK library
in the following way:

{% include 'readme/examples/callback.nigiri.md' %}

### Callback structure

{% set callback = callbacks[0] -%}

| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
{% for attribute, schema in callback.schema.items() -%}
{% if attribute == 'object' -%}
| object | [{{ callback|callback_object_name }}](#{{ callback|callback_object_name|lower }}) | Yes | {{ schema.description }} |
{% else -%}
| {{ attribute }} | _{{ schema|readme_parameter_type }}_ | {{ "Yes" if schema is required_field else "No" }} | {{ schema.description }} |
{% endif -%}
{% endfor %}

### Triggered events

| Event | Object Class |
|------------|--------------|
{% for callback in callbacks -%}
| `{{ callback.event_type}}` | [{{ callback|callback_object_name }}](#{{ callback|callback_object_name|lower }}) |
{% endfor %}

# Contributing

In order to maintain consistency between our backend and our SDKs, contributing through pull requests is highly
discouraged. Consider posting an issue if you need to signal any problem with this library.

# Security Issues

In case of a discovery of an actual or potential security issue please contact us at [info@chainside.net](mailto:info@chaniside.net)


