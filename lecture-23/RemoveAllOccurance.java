class RemoveAllOccurance{
    public static int isSubstringExist(String str, String part){
        int pos = -1;

        for(int i = 0; i<str.length()-part.length(); i++){
            if(str.charAt(i) == part.charAt(0)){
                int match = 1;
                pos++;
                for(int j = 1; j<part.length(); j++){
                    

                    if(str.charAt(i+j) == part.charAt(j)){
                        match++;
                    }else{
                        break;
                    }


                    if(match == part.length()){
                        return i;
                    }
                }

                if(match == part.length()){
                    return pos;
                }
            }
        }

        return pos;
    }

    public static String removeAllOuccrance(String s, String part){

        String temp = s;
        while(isSubstringExist(temp,part) != -1){
            temp = temp.replaceFirst(part,"");
        }

        return temp.replaceFirst(part,"");
    }

    public static void main(String arg[]){
        String s = "wwws";
        String part = "w";

        String result = removeAllOuccrance(s,part);

        System.out.println("result = "+result);


        // System.out.println("test : "+s.replaceFirst(part,""));
        // System.out.println("test : "+s.replaceFirst(part,""));
        // System.out.println("test : "+isSubstringExist(s,part));
    }
}