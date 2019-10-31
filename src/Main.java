public class Main {

    public static void main(String[] args) {
        Decoupe decoupe=new Decoupe("baccalauréat");
        System.out.println(decoupe.afficheSyllabe());
        decoupe=new Decoupe("anticonstitutionellement");
        System.out.println(decoupe.afficheSyllabe());
        decoupe=new Decoupe("directionnelle");
        System.out.println(decoupe.afficheSyllabe());
        decoupe=new Decoupe("kayak");
        System.out.println(decoupe.afficheSyllabe());

    }
}
