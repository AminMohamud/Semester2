package Opgave2;

public class main {
    public static void main(String[] args) {

        //Left side
        BinaryTree<Integer> femten = new BinaryTree<>(15);
        BinaryTree<Integer> femogtyve = new BinaryTree<>(25);
        BinaryTree<Integer> elleve = new BinaryTree<>(30,femogtyve,null);
        BinaryTree<Integer> tredive = new BinaryTree<>(11,null,femten);
        BinaryTree<Integer> toogtyve = new BinaryTree<>(22,elleve,tredive);

        //right side
        BinaryTree<Integer> otteogfirs = new BinaryTree<>(88);
        BinaryTree<Integer> halvfems = new BinaryTree<>(90,otteogfirs,null);
        BinaryTree<Integer> syvoghalvfjerds = new BinaryTree<>(77,null,halvfems);

        //Top G
        BinaryTree<Integer> femogfyrre = new BinaryTree<>(45,toogtyve,syvoghalvfjerds);

        System.out.println("Height:  " + femogfyrre.height());

        femogfyrre.printPreorder();

    }
}
