package lecture5;

public class StarWarsCollections {

    public static void main(String[] args) {
        final Jedi yoda = new Jedi("Yoda", Affiliation.JEDI_ORDER, 0.66, LightsaberColor.GREEN);
        final Jedi quiGonJinn = new Jedi("Qui-Gon Jinn", Affiliation.JEDI_ORDER, 1.93, LightsaberColor.LIGHT_BLUE);
        final Jedi obiWanKenobi = new Jedi("Obi-Wan Kenobi", Affiliation.JEDI_ORDER, 1.82, LightsaberColor.BLUE);
        final Jedi anakinSkywalker = new Jedi("Anakin Skywalker", Affiliation.JEDI_ORDER, 1.88, LightsaberColor.BLUE);
        final Jedi lukeSkywalker = new Jedi("Luke Skywalker", Affiliation.JEDI_ORDER, 1.72, LightsaberColor.GREEN);
        final Jedi sheevPalpatine = new Jedi("Sheev Palpatine", Affiliation.SITH, 1.73, LightsaberColor.RED);
        final Jedi darthVader = new Jedi("Darth Vader", Affiliation.SITH, 2.03, LightsaberColor.RED);
        final Jedi darthMaul = new Jedi("Darth Maul", Affiliation.SITH, 1.75, LightsaberColor.RED);
        final Jedi dooku = new Jedi("Dooku", Affiliation.SITH, 1.93, LightsaberColor.RED);
        final Jedi savageOpress = new Jedi("Savage Opress", Affiliation.SITH);

        yoda.setMasters(quiGonJinn);
        quiGonJinn.setMasters(dooku);
        obiWanKenobi.setMasters(yoda, quiGonJinn);
        anakinSkywalker.setMasters(quiGonJinn, obiWanKenobi);
        lukeSkywalker.setMasters(obiWanKenobi, yoda);
        sheevPalpatine.setMasters(new Jedi("Darth Plagueis", Affiliation.SITH));
        darthVader.setMasters(sheevPalpatine);
        darthMaul.setMasters(sheevPalpatine);
        dooku.setMasters(yoda, sheevPalpatine);

        yoda.setApprentices(dooku, obiWanKenobi, lukeSkywalker);
        quiGonJinn.setApprentices(obiWanKenobi,anakinSkywalker,yoda);
        obiWanKenobi.setApprentices(anakinSkywalker,lukeSkywalker);
        anakinSkywalker.setApprentices(new Jedi("Ahsoka Tano", Affiliation.JEDI_ORDER));

        sheevPalpatine.setApprentices(darthMaul,darthVader, new Jedi("Darth Tyranus", Affiliation.SITH));
        darthVader.setApprentices(new Jedi("The Inquisitor", Affiliation.SITH));
        darthMaul.setApprentices(savageOpress);
        dooku.setApprentices(quiGonJinn, new Jedi("Asajj Ventress", Affiliation.SITH), savageOpress);



        // TODO code goes here
    }
}
