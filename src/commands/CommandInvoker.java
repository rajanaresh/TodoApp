package commands;

public class CommandInvoker {
        public void invoke(Command comm) {
                comm.execute();
        }
}