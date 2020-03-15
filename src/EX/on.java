public static String runH_RLE(String hex){
        // List<String> res = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        //List<Character> tmp = new ArrayList<>();
        char before = hex.charAt(0);
        for(int i=1;i<hex.length()+1;i++){
        if(i < hex.length() && hex.charAt(i) == before) {
        tmp.append(before);
        } else{
        int count = tmp.length() + 1;
        while(count>=2048){
        res.append("1");
        res.append("000100");
        res.append(toBinary(before));
        count -= 2048;
        }
        while(count>=1024){
        res.append("1");
        res.append("000101000111");
        res.append(toBinary(before));
        count -= 1024;
        }
        while(count>=512){
        res.append("1");
        res.append("000101000110");
        res.append(toBinary(before));
        count -= 512;
        }
        while(count>=256){
        res.append("1");
        res.append("00010100010");
        res.append(toBinary(before));
        count -= 256;
        }
        while(count>=128){
        res.append("1");
        res.append("00010100001");
        res.append(toBinary(before));
        count -= 128;
        }
        while(count>=64){
        res.append("1");
        res.append("00010100000");
        res.append(toBinary(before));
        count -= 64;
        }
        while(count>=32){
        res.append("1");
        res.append("000101001");
        res.append(toBinary(before));
        count -= 32;
        }
        while