// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/maximum.proto

package com.proto.calculator;

public final class Maximum {
  private Maximum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_MaximumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_MaximumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_MaximumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_MaximumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030calculator/maximum.proto\022\ncalculator\"#" +
      "\n\016MaximumRequest\022\021\n\tfirst_num\030\001 \001(\005\"!\n\017M" +
      "aximumResponse\022\016\n\006result\030\001 \001(\005B\030\n\024com.pr" +
      "oto.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_MaximumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_MaximumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_MaximumRequest_descriptor,
        new java.lang.String[] { "FirstNum", });
    internal_static_calculator_MaximumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_MaximumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_MaximumResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
