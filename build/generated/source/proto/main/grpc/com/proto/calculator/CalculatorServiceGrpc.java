package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: calculator/calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.CalcRequest,
      com.proto.calculator.CalcResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = com.proto.calculator.CalcRequest.class,
      responseType = com.proto.calculator.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.CalcRequest,
      com.proto.calculator.CalcResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.CalcRequest, com.proto.calculator.CalcResponse> getCalculateMethod;
    if ((getCalculateMethod = CalculatorServiceGrpc.getCalculateMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getCalculateMethod = CalculatorServiceGrpc.getCalculateMethod) == null) {
          CalculatorServiceGrpc.getCalculateMethod = getCalculateMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.CalcRequest, com.proto.calculator.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("calculate"))
              .build();
        }
      }
    }
    return getCalculateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.PrimeRequest,
      com.proto.calculator.PrimeResponse> getPrimeFactorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "primeFactorize",
      requestType = com.proto.calculator.PrimeRequest.class,
      responseType = com.proto.calculator.PrimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.PrimeRequest,
      com.proto.calculator.PrimeResponse> getPrimeFactorizeMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.PrimeRequest, com.proto.calculator.PrimeResponse> getPrimeFactorizeMethod;
    if ((getPrimeFactorizeMethod = CalculatorServiceGrpc.getPrimeFactorizeMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimeFactorizeMethod = CalculatorServiceGrpc.getPrimeFactorizeMethod) == null) {
          CalculatorServiceGrpc.getPrimeFactorizeMethod = getPrimeFactorizeMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.PrimeRequest, com.proto.calculator.PrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "primeFactorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("primeFactorize"))
              .build();
        }
      }
    }
    return getPrimeFactorizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.EchoRequest,
      com.proto.calculator.EchoResponse> getEchoHelloNTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "echoHelloNTimes",
      requestType = com.proto.calculator.EchoRequest.class,
      responseType = com.proto.calculator.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.EchoRequest,
      com.proto.calculator.EchoResponse> getEchoHelloNTimesMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.EchoRequest, com.proto.calculator.EchoResponse> getEchoHelloNTimesMethod;
    if ((getEchoHelloNTimesMethod = CalculatorServiceGrpc.getEchoHelloNTimesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getEchoHelloNTimesMethod = CalculatorServiceGrpc.getEchoHelloNTimesMethod) == null) {
          CalculatorServiceGrpc.getEchoHelloNTimesMethod = getEchoHelloNTimesMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.EchoRequest, com.proto.calculator.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "echoHelloNTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("echoHelloNTimes"))
              .build();
        }
      }
    }
    return getEchoHelloNTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.AverageRequest,
      com.proto.calculator.AverageResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "average",
      requestType = com.proto.calculator.AverageRequest.class,
      responseType = com.proto.calculator.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.AverageRequest,
      com.proto.calculator.AverageResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.AverageRequest, com.proto.calculator.AverageResponse> getAverageMethod;
    if ((getAverageMethod = CalculatorServiceGrpc.getAverageMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAverageMethod = CalculatorServiceGrpc.getAverageMethod) == null) {
          CalculatorServiceGrpc.getAverageMethod = getAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.AverageRequest, com.proto.calculator.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("average"))
              .build();
        }
      }
    }
    return getAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.MaximumRequest,
      com.proto.calculator.MaximumResponse> getMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "maximum",
      requestType = com.proto.calculator.MaximumRequest.class,
      responseType = com.proto.calculator.MaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.MaximumRequest,
      com.proto.calculator.MaximumResponse> getMaximumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.MaximumRequest, com.proto.calculator.MaximumResponse> getMaximumMethod;
    if ((getMaximumMethod = CalculatorServiceGrpc.getMaximumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getMaximumMethod = CalculatorServiceGrpc.getMaximumMethod) == null) {
          CalculatorServiceGrpc.getMaximumMethod = getMaximumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.MaximumRequest, com.proto.calculator.MaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "maximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.MaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.MaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("maximum"))
              .build();
        }
      }
    }
    return getMaximumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.SqrtRequest,
      com.proto.calculator.SqrtResponse> getSqrtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sqrt",
      requestType = com.proto.calculator.SqrtRequest.class,
      responseType = com.proto.calculator.SqrtResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.SqrtRequest,
      com.proto.calculator.SqrtResponse> getSqrtMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.SqrtRequest, com.proto.calculator.SqrtResponse> getSqrtMethod;
    if ((getSqrtMethod = CalculatorServiceGrpc.getSqrtMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSqrtMethod = CalculatorServiceGrpc.getSqrtMethod) == null) {
          CalculatorServiceGrpc.getSqrtMethod = getSqrtMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.SqrtRequest, com.proto.calculator.SqrtResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sqrt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SqrtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SqrtResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("sqrt"))
              .build();
        }
      }
    }
    return getSqrtMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(com.proto.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    /**
     */
    public void primeFactorize(com.proto.calculator.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrimeFactorizeMethod(), responseObserver);
    }

    /**
     */
    public void echoHelloNTimes(com.proto.calculator.EchoRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoHelloNTimesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.AverageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.MaximumRequest> maximum(
        io.grpc.stub.StreamObserver<com.proto.calculator.MaximumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMaximumMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns Status.INVALID if SqrtRequest.number is negative
     * </pre>
     */
    public void sqrt(com.proto.calculator.SqrtRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SqrtResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSqrtMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.CalcRequest,
                com.proto.calculator.CalcResponse>(
                  this, METHODID_CALCULATE)))
          .addMethod(
            getPrimeFactorizeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.PrimeRequest,
                com.proto.calculator.PrimeResponse>(
                  this, METHODID_PRIME_FACTORIZE)))
          .addMethod(
            getEchoHelloNTimesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.EchoRequest,
                com.proto.calculator.EchoResponse>(
                  this, METHODID_ECHO_HELLO_NTIMES)))
          .addMethod(
            getAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calculator.AverageRequest,
                com.proto.calculator.AverageResponse>(
                  this, METHODID_AVERAGE)))
          .addMethod(
            getMaximumMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.calculator.MaximumRequest,
                com.proto.calculator.MaximumResponse>(
                  this, METHODID_MAXIMUM)))
          .addMethod(
            getSqrtMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.SqrtRequest,
                com.proto.calculator.SqrtResponse>(
                  this, METHODID_SQRT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculate(com.proto.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primeFactorize(com.proto.calculator.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPrimeFactorizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echoHelloNTimes(com.proto.calculator.EchoRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEchoHelloNTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.AverageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.MaximumRequest> maximum(
        io.grpc.stub.StreamObserver<com.proto.calculator.MaximumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMaximumMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Returns Status.INVALID if SqrtRequest.number is negative
     * </pre>
     */
    public void sqrt(com.proto.calculator.SqrtRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SqrtResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.CalcResponse calculate(com.proto.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.PrimeResponse> primeFactorize(
        com.proto.calculator.PrimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPrimeFactorizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.EchoResponse> echoHelloNTimes(
        com.proto.calculator.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEchoHelloNTimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns Status.INVALID if SqrtRequest.number is negative
     * </pre>
     */
    public com.proto.calculator.SqrtResponse sqrt(com.proto.calculator.SqrtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSqrtMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.CalcResponse> calculate(
        com.proto.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns Status.INVALID if SqrtRequest.number is negative
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.SqrtResponse> sqrt(
        com.proto.calculator.SqrtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;
  private static final int METHODID_PRIME_FACTORIZE = 1;
  private static final int METHODID_ECHO_HELLO_NTIMES = 2;
  private static final int METHODID_SQRT = 3;
  private static final int METHODID_AVERAGE = 4;
  private static final int METHODID_MAXIMUM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((com.proto.calculator.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.CalcResponse>) responseObserver);
          break;
        case METHODID_PRIME_FACTORIZE:
          serviceImpl.primeFactorize((com.proto.calculator.PrimeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse>) responseObserver);
          break;
        case METHODID_ECHO_HELLO_NTIMES:
          serviceImpl.echoHelloNTimes((com.proto.calculator.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.EchoResponse>) responseObserver);
          break;
        case METHODID_SQRT:
          serviceImpl.sqrt((com.proto.calculator.SqrtRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.SqrtResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.proto.calculator.AverageResponse>) responseObserver);
        case METHODID_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.maximum(
              (io.grpc.stub.StreamObserver<com.proto.calculator.MaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .addMethod(getPrimeFactorizeMethod())
              .addMethod(getEchoHelloNTimesMethod())
              .addMethod(getAverageMethod())
              .addMethod(getMaximumMethod())
              .addMethod(getSqrtMethod())
              .build();
        }
      }
    }
    return result;
  }
}
