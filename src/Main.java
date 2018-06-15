import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by codecadet on 15/06/2018.
 */
public class Main {
    public static void main(String[] args) {

        String host = getHost();

        try {

            InetAddress inetAddress = InetAddress.getByName(host);
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.isReachable(1000));

        } catch (UnknownHostException ex) {
            System.err.print(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getHost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hostname? ");
        return scanner.nextLine();
    }
}

