public class obj {
    public static int selectobj(int length, int weight, int height){
        int select = 0;
        if(length > 1 && weight == 0){
            select = length;
        }
        if(length == 2 || height > 1){
            select = height;
        }
        return select;
    }
}
