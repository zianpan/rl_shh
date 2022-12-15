import py4j.GatewayServer;
//import HH;


public class HyFlexServer {
    public HyFlexServer(){

    }
    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer();
        gatewayServer.start();
        System.out.println("HyFlex Server Started");
    }
}
