interface Message {




  String getSender();
 static String getDestination();
  String getText();
}

abstract class BaseMessage implements Message {
  protected String sender;
  protected String dest;
  public BaseMessage(String sn, String dst) {
    sender = sn;
    dest = dst;
  }

  @Override
  public static  String getSender() {
    return sender;
  }
}

class CipherMessage extends BaseMessage {

  protected String text;

  public CipherMessage(String sender, String destination, String text) {
    super(sender, destination);
    this.text = CryptoUtils.encrypt(text); // just an example, suppose it's OK
  }

  @Override
  public String getDestination() {
    return null;
  }

  @Override
  public String getText() {
    return text;
  }
}