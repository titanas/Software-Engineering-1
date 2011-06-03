package psi_1;

import strategy.*;
import templateMethod.KrovinysPristatomasAutomobiliu;
import templateMethod.KrovinysPristatomasSunkvežimiu;
import templateMethod.PaštoSiuntaPristatomaAutomobiliu;
import templateMethod.PaštoSiuntaPristatomaAutomobiliu;
import templateMethod.PaštoSiuntaPristatomaSunkvežimiu;
import templateMethod.PaštoSiuntaPristatomaSunkvežimiu;

public class Siuntėjas {

    public Siuntėjas () {
    }

    // Strategijos atveju, kai krovinys kompozicijos gali tureti ivairius pristatymus
    public void siūstiKrovinį (Krovinys krovinys) {
        System.out.println(krovinys.getPristatymas().toString());
        System.out.println("    Viso: " + krovinys.pristatymoKaina() + "\n");
    }

    // Template method atveju, kai krovinys pristatomas tik automobiliu
    public void siūstiKrovinįPristatomąAutomobiliu (KrovinysPristatomasAutomobiliu krovinys) {
        System.out.println("Krovinys pristatomas automobiliu");
        System.out.println("    Viso: " + krovinys.pristatymoKaina() + "\n");
    }
    
    // Template method atveju, kai krovinys pristatomas tik sunkvežimiu
    public void siūstiKrovinįPristatomąSunkvežimiu (KrovinysPristatomasSunkvežimiu krovinys) {
        System.out.println("Krovinys pristatomas sunkvežimiu");
        System.out.println("    Viso: " + krovinys.pristatymoKaina() + "\n");
    }

    // NAUJA ESYBĖ
    // Strategy atvejis, pašto siunta gali turėti įvairius pristatymus
    public void siūstiPaštoSiuntą (PaštoSiunta siunta) {
        System.out.println(siunta.getPristatymas().toString());
        System.out.println("    Viso: " + siunta.pristatymoKaina() + "\n");
    }

    // Template method pašto siutna extend'inama AbstractKrovinys
    public void siūstiPaštoSiuntąPristatomąAutomobiliu (PaštoSiuntaPristatomaAutomobiliu siunta) {
        System.out.println("Pašto siunta pristatoma automobiliu");
        System.out.println("    Viso: " + siunta.pristatymoKaina() + "\n");
    }

    // Template method pašto siutna extend'inama AbstractKrovinys
    public void siūstiPaštoSiuntąPristatomąSunkvežimiu (PaštoSiuntaPristatomaSunkvežimiu siunta) {
        System.out.println("Pašto siunta pristatoma sunkvežimiu");
        System.out.println("    Viso: " + siunta.pristatymoKaina() + "\n");
    }

    // Template method pašto siutna extend'inama AbstractPaštoSiunta
    public void siūstiPaštoSiuntąPristatomąAutomobiliu2 (PaštoSiuntaPristatomaAutomobiliu siunta) {
        System.out.println("Pašto siunta pristatoma automobiliu");
        System.out.println("    Viso: " + siunta.pristatymoKaina() + "\n");
    }

    // Template method pašto siutna extend'inama AbstractPaštoSiunta
    public void siūstiPaštoSiuntąPristatomąSunkvežimiu2 (PaštoSiuntaPristatomaSunkvežimiu siunta) {
        System.out.println("Pašto siunta pristatoma sunkvežimiu");
        System.out.println("    Viso: " + siunta.pristatymoKaina() + "\n");
    }
}
