package com.isi;

public class NotifSms extends Decorator{

    public NotifSms(NotifComponent notif){
        notifComponent = notif;
        setObjet("Nouveau message par sms");
        setMessage("ceci est un nouveau message");
        setDestinataire("Kodjo");
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
