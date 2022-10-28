// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g) {
        int sqwidth = 980;
        int sqheight = 630;
        int sqx1 = 10;
        int sqy1 = 640;
        int sqx2 = 990;
        int sqy2 = 640;
        g.drawRect(10, 10, sqwidth, sqheight);


        //Bottom Right

        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;

        for (int k = 0; k < 49; k++) {

            g.drawLine(x1, y1, x2, y2);

            x1 += 20;
            y2 -= 13;

        }

        //Bottom Left

        int lx1 = 990;
        int ly1 =640;
        int lx2 = 10;
        int ly2 = 640;



            for (int k = 0; k < 49; k++) {

                g.drawLine(lx1, ly1, lx2, ly2);

                lx1 -= 20;
                ly2 -= 13;

            }

        //Top Right

        int trx1 = 10;
        int try1 = 10;
        int trx2 = 990;
        int try2 = 10;

        for (int k = 0; k < 49; k++) {

            g.drawLine(trx1, try1, trx2, try2);

            trx1 += 20;
            try2 += 13;

        }

        //Top Left

        int tlx1 = 10;
        int tly1 = 10;
        int tlx2 = 990;
        int tly2 = 10;

        for (int k = 0; k < 49; k++) {

            g.drawLine(tlx1, tly1, tlx2, tly2);

            tlx2 -= 20;
            tly1 += 13;

        }

        //Internal Display

        g.drawRect(248,175,505,300);


        //Bottom Right Box

        int bx1 = 248;
        int by1 = 475;
        int bx2 = 753;
        int by2 = 475;

        for (int k = 0; k < 25; k++) {

            g.drawLine(bx1, by1, bx2, by2);

            bx1 += 20;
            by2 -= 12;

        }

        //Bottom Left Box

        int blx1 = 753;
        int bly1 =475;
        int blx2 = 248;
        int bly2 = 475;



        for (int k = 0; k < 25; k++) {

            g.drawLine(blx1, bly1, blx2, bly2);

            blx1 -= 20;
            bly2 -= 12;

        }

        //Top Left Box

        //Top Left

        int tlbx1 = 248;
        int tlby1 = 175;
        int tlbx2 = 753;
        int tlby2 = 175;

        for (int k = 0; k < 25; k++) {

            g.drawLine(tlbx1, tlby1, tlbx2, tlby2);

            tlbx2 -= 20;
            tlby1 += 12;

        }

        //Top Right Box

        //Top Right

        int trbx1 = 248;
        int trby1 = 175;
        int trbx2 = 753;
        int trby2 = 175;

        for (int k = 0; k < 25; k++) {

            g.drawLine(trbx1, trby1, trbx2, trby2);

            trbx1 += 20;
            trby2 += 12;

        }



    }

    }



