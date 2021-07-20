/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author saipr
 */
public class Reloj implements Runnable
{

    Thread h;
    String hora, minutos, segundos, ampm;
    String dia, mes, año;
    Calendar calendario;
    private boolean b = true;

    public Reloj()
    {
        h = new Thread(this);
        h.start();
    }

    @Override
    public void run()
    {
        Thread ct = Thread.currentThread();
        while (ct == h)
        {
            calcula();

            try
            {
                Thread.sleep(1000);

            } catch (Exception e)
            {
                System.out.println("Error en el reloj");
                System.out.println(hora + ":" + minutos + ":" + segundos + " " + ampm);

            }
            if (!b)
            {
                calcula();
                break;
            }
        }
    }

    private void calcula()
    {
        calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        if (b)
        {
            ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
            if (ampm.equals("PM"))
            {
                int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
                hora = h > 9 ? "" + h : "0" + h;
            } else
            {
                hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
            }
            minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
            System.out.println(hora + ":" + minutos + ":" + segundos + " " + ampm);
            CPnlContenido1.vEditLblFechaHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
        } else
        {
            dia = calendario.get(Calendar.DAY_OF_MONTH) > 9 ? "" + calendario.get(Calendar.DAY_OF_MONTH) : "0" + calendario.get(Calendar.DAY_OF_MONTH);
            mes = (calendario.get(Calendar.MONTH) + 1) > 9 ? ("" + (calendario.get(Calendar.MONTH) + 1)) : ("0" + (calendario.get(Calendar.MONTH) + 1));
            año = String.valueOf(calendario.get(Calendar.YEAR));
            CPnlContenido1.vEditLblFechaHora.setText(dia + "/" + mes + "/" + año);
        }
    }

    public void setB(boolean b)
    {
        this.b = b;
    }

}
