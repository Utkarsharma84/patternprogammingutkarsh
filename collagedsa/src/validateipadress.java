//public class validateipadress {
//    public static boolean isValidIPv4(String ip) {
//        if (ip == null || ip.isEmpty()) return false;
//
//        // Splitting the string by "."
//        String[] parts = ip.split("\\.");
//
//        // Checking if we have exactly 4 parts
//        if (parts.length != 4) return false;
//
//        for (String part : parts) {
//            // Check if the part is a valid number
//            if (!part.matches("\\d+")) return false;
//
//            // Convert the string part to an integer
//            int num;
//            try {
//                num = Integer.parseInt(part);
//            } catch (NumberFormatException e) {
//                return false; // If it exceeds integer range
//            }
//
//            // Check if it's in the valid range
//            if (num < 0 || num > 255) return false;
//
//            // Check for leading zeros (except for "0" itself)
//            if (part.length() > 1 && part.charAt(0) == '0') return false;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        // Test Cases
//        String[] testIPs = {
//                "172.16.254.1",  // Valid
//                "0.0.0.0",       // Valid
//                "255.255.255.255", // Valid
//                "256.100.100.100", // Invalid (256 out of range)
//                "192.168.1.01",  // Invalid (leading zero in "01")
//                "192.168.1.",    // Invalid (missing last part)
//                "192.168..1",    // Invalid (extra dot)
//                "abc.def.ghi.jkl" // Invalid (non-numeric)
//        };
//
//        for (String ip : testIPs) {
//            System.out.println(ip + " -> " + (isValidIPv4(ip) ? "Valid" : "Invalid"));
//        }
//    }
//}
//public class validateip{
//    public static int isvalid(String[]args){
//        //split the string by"."
//        String[]parts=new String[9];
//    }
//    public static void main(String[] args) {
//
//    }
//}