package calculator.client;

import com.proto.calculator.*;
import com.proto.greeting.GreetingRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    private static void doCalculate(ManagedChannel channel){
        System.out.println("Enter doCalculate");
        //GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        CalcResponse response = stub.calculate(
                CalcRequest.newBuilder()
                            .setFirstNum(27)
                            .setSecondNum(37)
                            .build());
                System.out.println("Sum of 27 and 37: "+ response.getResult());
    }
    private static void doPrimeDecompose(ManagedChannel channel){
        System.out.println("Enter doPrimeDecompose");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        stub.primeFactorize(PrimeRequest.newBuilder().setNum(12345).build())
            .forEachRemaining(
                    response -> {
                        System.out.println(response.getResult());
                    }
            );

    }

    private static void doEcho(ManagedChannel channel){
        System.out.println("Enter doEcho");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        Iterator<EchoResponse> itr = stub.echoHelloNTimes(EchoRequest.newBuilder().setNoOfTimes(3).build());
        itr.forEachRemaining(
                response -> {
                    System.out.println(response.getResult());
                }
        );
                //primeFactorize(PrimeRequest.newBuilder().setNum(12345).build());
        itr.forEachRemaining(
                response -> {
                    System.out.println(response.getResult());
                }
        );

    }
    private static void doAverage(ManagedChannel channel) throws InterruptedException {
        System.out.println("Enter do Average");
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);
        List<Integer> nums = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(1);
        Collections.addAll(nums, 1,2,3,4,5,6);
        StreamObserver<AverageRequest> stream = stub.average(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse response) {
                System.out.println(response.getResult());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });
        for (Integer num: nums){
            stream.onNext(AverageRequest.newBuilder().setFirstNum(num).build());
        }
        stream.onCompleted();
        latch.await(3, TimeUnit.SECONDS);

    }

    private static void doMaximum(ManagedChannel channel) throws InterruptedException {
        System.out.println("Enter do maximum");
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<MaximumRequest> stream = stub.maximum(new StreamObserver<MaximumResponse>() {
            @Override
            public void onNext(MaximumResponse response) {
                System.out.println(response.getResult()+",");
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });
        Arrays.asList(2,1,3,30,20,99).forEach( num ->{
            stream.onNext(MaximumRequest.newBuilder().setFirstNum(num).build());
        });
        stream.onCompleted();
        latch.await(3, TimeUnit.SECONDS);

    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length == 0){
            System.out.println("Need 1 arguments to work.");
            return;
        }
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .usePlaintext()
                .build();
        switch(args[0]){
            case "calculate" : doCalculate(channel); break;
            case "prime_decompose": doPrimeDecompose(channel); break;
            case "echo": doEcho(channel); break;
            case "average": doAverage(channel); break;
            case "maximum": doMaximum(channel); break;
            case "sqrt": doSqrt(channel); break;
            default:
                System.out.println("Keyword Invalid: " + args);
        }
    }

    private static void doSqrt(ManagedChannel channel) throws InterruptedException{
        System.out.println("Enter doSqrt()");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        SqrtResponse response = stub.sqrt(SqrtRequest.newBuilder().setNumber(25).build());
        System.out.println("Sqrt of 25 = " + response.getResult());
        try{
            response = stub.sqrt(SqrtRequest.newBuilder().setNumber(-1).build());
            System.out.println("Sqrt -1:"+ response.getResult());
        } catch(RuntimeException e){
            System.out.println("Got an Exception for sqrt");
            e.printStackTrace();
        }
    }
}
