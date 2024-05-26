package centrale;

/** de simulatie. Afgesplitst van verkeerlichtenCentrale want elek class mag maar 1 verantwoordelijkheid hebben */
class Simulatie {
    /** start de simulatie */
    public static void main(String[] args) {
        final VerkeerslichtenCentrale centrale1=new VerkeerslichtenCentrale();
        //centrale1.initialize();  // iw is verantwoordelijk om te weten hoe een centrale intern werkt? → de VerkeerslichtenCentrale

        centrale1.schakelLichtUit(3);

        System.out.println("centralestandaard versie: "+ VerkeerslichtenCentrale.getCentraleVersie());
        for (int i=1;i<=centrale1.getAantalLichten();i++) {
            System.out.println("verkeerslicht "+( centrale1.isVerkeerslichtActief(i)?"aan":"uit"));
        }
    }
}
