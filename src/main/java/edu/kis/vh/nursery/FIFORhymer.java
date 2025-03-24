package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca implementację systemu "FIFO" (First In, First Out) dla licznika.
 * Dziedziczy po klasie DefaultCountingOutRhymer i implementuje metodę countOut(),
 * która umożliwia liczenie w porządku FIFO.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	/**
     * Tymczasowy obiekt DefaultCountingOutRhymer wykorzystywany do przechowywania elementów
     * podczas operacji na danych w metodzie countOut().
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Wyjmuje liczbę z obiektu FIFORhymer zgodnie z zasadą FIFO. 
     * Metoda ta tymczasowo przechowuje elementy w pomocniczym obiekcie `temp`, 
     * aby wyciągnąć najstarszy element z oryginalnej struktury.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int result = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return result;
    }
}
