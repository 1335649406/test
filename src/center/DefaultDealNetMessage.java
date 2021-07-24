package center;


import PollingSocket.IDealNetMessage;
import com.mec.util.ArgumentMaker;

public class DefaultDealNetMessage implements IDealNetMessage {
    public DefaultDealNetMessage() {
    }

    @Override
    public LoadDefinition dealNetMessage(String message) {
        return ArgumentMaker.gson.fromJson(message, LoadDefinition.class);
    }
}
