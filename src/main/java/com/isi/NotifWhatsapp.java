package com.isi;

public class NotifWhatsapp extends Decorator{

    public NotifWhatsapp(NotifComponent notif){
        notifComponent = notif;
        setObjet("Nouveau message par whatsapp");
        setMessage("ceci est un nouveau message");
        setDestinataire("Pape");
    }

    @Override
    public String toString() {
        return "Message{" +
                "objet='" + getObjet() + '\'' +
                ", destinataire=" + getDestinataire() +
                ", message=" + getMessage() +
                '}';
    }
}
