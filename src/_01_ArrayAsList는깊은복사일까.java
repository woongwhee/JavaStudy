import java.util.Arrays;
import java.util.List;
/*
* java.util.Arrays에 있는 Arrays.asList() 는 배열을 사이즈를 변경 할 수 없는 리스트로 반환해준다.
* 가지고있는 메서드는 set
* */
public class _01_ArrayAsList는깊은복사일까 {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        List<Integer> asList = List.of(arr);
        System.out.println("size : "+asList.size());
        //asList.remove(1);UnsupportedOperationException 을 반환한다.
        System.out.println(asList.get(1));//2
        arr[1]=3;
        System.out.println(asList.get(1));//2
        //깊은복사로 다른 값을 반환한다.
        Node[] nodeArray=new Node[10];
        for (int i = 0; i < nodeArray.length; i++) {
            nodeArray[i]=new Node(""+i);
        }
        List<Node> nodeList = List.of(nodeArray);
        System.out.println("참조값 : "+nodeList.get(1).data);
        nodeArray[1].data="3";
        System.out.println("원본값 변경시 : "+nodeList.get(1).data);//3
        nodeArray[1]=new Node("5");
        System.out.println(" 배열이 참조하고있는 주소 변경시 : "+nodeList.get(1).data);//3


    }
    static class Node{
        String data;

        public Node(String data) {
            this.data = data;
        }
    }

}
