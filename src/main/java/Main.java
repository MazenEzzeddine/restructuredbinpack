import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutionException;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);
    // static BinPackRestructure bp;

    static BinPackRestructureWithLag bp;

    /* static BinPackState bps;
    static BinPackLag bpl;*/


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        initialize();
    }


    private static void initialize() throws InterruptedException, ExecutionException {
       /* bps = new BinPackState();
        bpl = new BinPackLag();*/

       // bp = new BinPackRestructure();
        bp = new BinPackRestructureWithLag();

        Lag.readEnvAndCrateAdminClient();
        log.info("Warming 15  seconds.");
        Thread.sleep(15 * 1000);



        while (true) {
            log.info("Querying Prometheus");
            ArrivalProducer.callForArrivals();
            Lag.getCommittedLatestOffsetsAndLag();
            scaleLogic();
            log.info("--------------------");
            log.info("--------------------");
            log.info("Sleeping for 500 seconds");
            log.info("******************************************");
            log.info("******************************************");
            //Thread.sleep(1000);

            Thread.sleep(500);

        }
    }





    private static void scaleLogic() throws InterruptedException {

     /*   if  (Duration.between(bp.LastUpScaleDecision, Instant.now()).getSeconds() > 10) {
        } else {
            log.info("No scale group 1 cooldown");
        }*/


        //BinPackRestructure200.scaleAsPerBinPackRestructured();
       // BinPackRestructureWithLagLag.scaleAsPerBinPackRestructured();

       // BinPackRestructure200new.scaleAsPerBinPackRestructured();


        //BinPackRestructureWithLagLag.scaleAsPerBinPackRestructured();


      //  BinPackRestructureWithLagLag2.scaleAsPerBinPackRestructured();


        //BinPackRestructureWithLagLag3.scaleAsPerBinPackRestructured();



       // BinPackRestructureWithLagLag4.scaleAsPerBinPackRestructured();



        //BinPackRestructureWithLagLag6.scaleAsPerBinPackRestructured();

       // BinPackRestructureWithLagLag4.scaleAsPerBinPackRestructured(); // new model with lamda

        //BinPackRestructureWithLagLag8.scaleAsPerBinPackRestructured(); // new model without lamda


       // BinPackRestructureWithLagLag8.scaleAsPerBinPackRestructured(); //new model

        //BinPackRestructureWithLagLag8o.scaleAsPerBinPackRestructured();  //old model


        BinPackRestructureWithLagLag8p.scaleAsPerBinPackRestructured(); //new model





/*

              if  (Duration.between(BinPackRestructureWithLagLag6.LastUpScaleDecision, Instant.now()).getSeconds() > 5) {
                 // BinPackRestructureWithLagLag4.scaleAsPerBinPackRestructured(); a tester

                  BinPackRestructureWithLagLag6.scaleAsPerBinPackRestructured();


        } else {
            log.info("No scale group 1 cooldown");
        }


*/



    }










}
