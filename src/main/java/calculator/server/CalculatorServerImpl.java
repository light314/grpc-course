package calculator.server;

import com.proto.calculator.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class CalculatorServerImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase{

    @Override
    public void calculate(CalcRequest request, StreamObserver<CalcResponse> responseObserver){
        System.out.println("Entering calculate...");
        responseObserver.onNext(
                CalcResponse
                        .newBuilder()
                        .setResult(request.getFirstNum() + request.getSecondNum())
                        .build());
        responseObserver.onCompleted();
    }
       @Override
      public void primeFactorize(com.proto.calculator.PrimeRequest request,
                                  io.grpc.stub.StreamObserver<com.proto.calculator.PrimeResponse> responseObserver){
           int k = 2;
           int N = request.getNum();
           while (N > 1) {
               if (N % k == 0){
                   PrimeResponse response = PrimeResponse.newBuilder().setResult(k).build();
                   responseObserver.onNext(response);
                   N = N/k;
               } else{
                   k++;
               }
           }
           responseObserver.onCompleted();
       }

    @Override
    public void echoHelloNTimes(EchoRequest request, StreamObserver<EchoResponse> responseObserver) {
        int n = request.getNoOfTimes();
        while (n>0){
            EchoResponse response = EchoResponse.newBuilder().setResult("Hello").build();
            responseObserver.onNext(response);
            n--;
        }
        responseObserver.onCompleted();
    }
    
    @Override
    public StreamObserver<AverageRequest> average(StreamObserver<AverageResponse> responseStreamObserver){

         return new StreamObserver<AverageRequest>() {
             float sum=0.0F; float count= 0.0F; float average=0.0F;
             @Override
            public void onNext(AverageRequest request) {
                sum = sum + request.getFirstNum();
                count += 1;
                 System.out.println("Sum:"+sum);
                 System.out.println("Count:"+count);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                average = sum/count;
                responseStreamObserver.onNext(AverageResponse.newBuilder().setResult(average).build());
                responseStreamObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<MaximumRequest> maximum(StreamObserver<MaximumResponse> responseObserver){
        return new StreamObserver<MaximumRequest>() {
            int max = Integer.MIN_VALUE;
            @Override
            public void onNext(MaximumRequest request) {
                if (max<(request.getFirstNum())){
                    max = request.getFirstNum();
                    responseObserver.onNext(MaximumResponse.newBuilder().setResult(max).build());
                }

            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public void sqrt(SqrtRequest request, StreamObserver<SqrtResponse> responseObserver){
        int number = request.getNumber();
        if (number <0) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Number being sent cannot be negative.")
                    .augmentDescription("Number:" + number)
                    .asRuntimeException());
            return;
        }
        responseObserver.onNext(
                SqrtResponse.newBuilder().setResult(Math.sqrt(number)).build()
        );
        responseObserver.onCompleted();
    }
}
