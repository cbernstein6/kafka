package org.apache.kafka.tools;

import org.apache.kafka.common.utils.Exit;
import org.apache.kafka.common.utils.Utils;

public class PartitionHotspot {

    public static void main(String... args) {
        Exit.exit(mainNoExit(args));
    }

    static int mainNoExit(String... args) {
        try {
            query();
            return 0;
        } catch (Throwable e) {
            System.err.println("Error occurred: " + e.getMessage());
            System.err.println(Utils.stackTrace(e));
            return 1;
        }
    }

    private static void query() {
// need partition and broker flags to specify what is suspected of hotspot

//TODO: make query for offset, wait 30 seconds, query again. This shows consumer lag
        PartitionHotspot partitionHotspot = new PartitionHotspot();
//            flag partition as hotspot with >2X lag,
        }
    }
}