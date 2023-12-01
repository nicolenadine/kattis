//https://www.baeldung.com/java-stream-filter-lambda
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader((new InputStreamReader(System.in)));
        int numPackages = Integer.parseInt(input.readLine());
        List<String> packages = new ArrayList<>(numPackages);
        for( int i = 0; i < numPackages; i++){
            packages.add(input.readLine());
        }
        List<String> matches = packages.stream().map(String::toLowerCase).filter(it -> it.contains("pink") || it.contains("rose")).toList();
        System.out.println(((matches.isEmpty())?"I must watch Star Wars with my daughter":matches.size()));
    }
}