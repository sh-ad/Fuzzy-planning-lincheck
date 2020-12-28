package reloadTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException {

        AtomicReference<Integer> atom = new AtomicReference<>();
        atom.set(32);
        System.out.println(atom);
        atom.compareAndSet(32, 64);
        System.out.println(atom);
    }
}
