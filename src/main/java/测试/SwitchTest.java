package 测试;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @author lysoy
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@State(Scope.Thread)
public class SwitchTest {
    static Integer _NUM = 9;

    @Benchmark
    public void switchTest(){
        int num1;
        switch (_NUM){
            case 1:
                num1 = 1;
                break;
            case 3:
                num1 = 3;
                break;
            case 5:
                num1 = 5;
                break;
            case 7:
                num1 = 7;
                break;
            case 9:
                num1 = 9;
                break;
            default :
                num1 = -1;
        }
        }

    @Benchmark
    public void ifTest() {
        int num1;
        if (_NUM==1){
            num1 = 1;
        }else if (_NUM == 2) {
            num1 = 2;
        }else if (_NUM == 3) {
            num1 = 3;
        }else if (_NUM == 4) {
            num1 = 3;
        }else if (_NUM == 5) {
            num1 = 3;
        }else {
            num1=-1;
        }
    }
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(SwitchTest.class.getSimpleName())
                .build();
        new Runner(options).run();
    }
}
