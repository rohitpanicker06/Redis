package commands.ping;

import commands.Command;

public class Ping implements Command {
  PingReceiver pingReceiver;


  public Ping(PingReceiver pingReceiver) {
    this.pingReceiver = pingReceiver;
  }

  @Override
    public String execute() {
    return pingReceiver.execute();
    }
}
