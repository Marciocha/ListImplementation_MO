package com.sdajava.listimplementation;

/**
 * Created by user on 2017-03-06.
 */
public class ListImpl {

    //tworze klase zagniezdzona

        private Node start;
        private Node stop;

        //funkcja ktora nam wyzeruje te dwa elementy

        public ListImpl() {
            this.start = null; //this nie musi byc bo nie mamy takich samych nazw
            this.stop = null; //this nie musi byc
        }

        //funkcja ktora bedzie odpowiadac za wstawienie czegos

        public void addElement(String value) {

            //tworzymy nowy wezel

            Node node = new Node(value, null, null);

            //metoda ktora sprawdzi czy lista jest pusta
            //tworzenie nowego elementu

            if (checkIsEmpty()) {
                start = node;
                stop = node;
            } else {
                Node pm = start; //klase start przypisujemy do wezla pm

                //pobieram nastepne elementy z wykorzystaniem while do momentu az bedzie rozny od nulla

                while (pm != null) {
                    pm.getNext(); //iteruje sie

                    //jesli sie przeiterujemy po tym wezle to trzeba teraz ten element wstawic
                    if (pm == start) {
                        node.setNext(pm);
                        pm.setPrev(node);
                        start = node;
                        break; //przerywa petle wychodzi z niej
                        //a w przeciwnym wypadku
                    } else {
                        node.setNext(pm);
                        node.setPrev(pm.getPrev());
                        pm.getPrev().setPrev(node);
                        pm.setPrev(node);
                        break;
                    }

                }
                if (pm == null) {
                    stop.setNext(node);
                    node.setPrev(stop);
                    stop = node;
                }
            }

        }

        public boolean checkIsEmpty(){
            return (start == null);
        }
}

