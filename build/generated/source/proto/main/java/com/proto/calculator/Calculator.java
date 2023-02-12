// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

public final class Calculator {
  private Calculator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_CalcRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_CalcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_CalcResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_CalcResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033calculator/calculator.proto\022\ncalculato" +
      "r\032\026calculator/prime.proto\032\025calculator/ec" +
      "ho.proto\032\030calculator/average.proto\032\030calc" +
      "ulator/maximum.proto\032\025calculator/sqrt.pr" +
      "oto\"4\n\013CalcRequest\022\021\n\tfirst_num\030\001 \001(\003\022\022\n" +
      "\nsecond_num\030\002 \001(\003\"\036\n\014CalcResponse\022\016\n\006res" +
      "ult\030\001 \001(\0032\255\003\n\021CalculatorService\022>\n\tcalcu" +
      "late\022\027.calculator.CalcRequest\032\030.calculat" +
      "or.CalcResponse\022G\n\016primeFactorize\022\030.calc" +
      "ulator.PrimeRequest\032\031.calculator.PrimeRe" +
      "sponse0\001\022F\n\017echoHelloNTimes\022\027.calculator" +
      ".EchoRequest\032\030.calculator.EchoResponse0\001" +
      "\022D\n\007average\022\032.calculator.AverageRequest\032" +
      "\033.calculator.AverageResponse(\001\022F\n\007maximu" +
      "m\022\032.calculator.MaximumRequest\032\033.calculat" +
      "or.MaximumResponse(\0010\001\0229\n\004sqrt\022\027.calcula" +
      "tor.SqrtRequest\032\030.calculator.SqrtRespons" +
      "eB\030\n\024com.proto.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.proto.calculator.Prime.getDescriptor(),
          com.proto.calculator.Echo.getDescriptor(),
          com.proto.calculator.Average.getDescriptor(),
          com.proto.calculator.Maximum.getDescriptor(),
          com.proto.calculator.Sqrt.getDescriptor(),
        });
    internal_static_calculator_CalcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_CalcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_CalcRequest_descriptor,
        new java.lang.String[] { "FirstNum", "SecondNum", });
    internal_static_calculator_CalcResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_CalcResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_CalcResponse_descriptor,
        new java.lang.String[] { "Result", });
    com.proto.calculator.Prime.getDescriptor();
    com.proto.calculator.Echo.getDescriptor();
    com.proto.calculator.Average.getDescriptor();
    com.proto.calculator.Maximum.getDescriptor();
    com.proto.calculator.Sqrt.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}