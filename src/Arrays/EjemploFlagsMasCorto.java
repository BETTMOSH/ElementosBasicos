package Arrays;

public class EjemploFlagsMasCorto {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,10,6};
        boolean ordenado = true;
        for (int i = 0; i < nums.length -1; i++) {// -2 para quedarse en la penúltima posición
            if (nums[i] > nums[i+1]) {
            }else {
                ordenado = false;
                break;
            }
        }if (ordenado){
            System.out.println("ordenado");
        }else {
            System.out.println("desordenado");
        }
    }
}
