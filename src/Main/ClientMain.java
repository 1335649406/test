package Main;

import balance.DefaultNetNode;
import center.IRegistryCenter;
import com.mec.util.proxy.MethodInvokerNotSetException;
import rmi.core.RMIClient;

import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        RMIClient client = new RMIClient("127.0.0.1", 54188);
        List<DefaultNetNode> netNodes = null;
        try {
            IRegistryCenter proxy = client.getProxy(IRegistryCenter.class);
            netNodes = proxy.getService("获取服务");
        } catch (InstantiationException | IllegalAccessException | MethodInvokerNotSetException ignored) {
        }
        DefaultNetNode defaultNetNode = netNodes.get(0);
        System.out.println(defaultNetNode.getIp() + defaultNetNode.getPort());
    }
}
