import galapagos.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

class Mensaje{
    public static void main(String[] args) {
        TurtleDrawingWindow win = new TurtleDrawingWindow();
	    win.setGrid(false);
	    //win.setUnit(1.5);
	    win.setOrigin(340, -190);
        win.setSize(1600, 900);
        int speed = 400;
	    Turtle pablito = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito2 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito3 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito4 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito5 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito6 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito7 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle pablito8 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle carlitos = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        Turtle carlitos2 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        pablito2.speed(speed);
        pablito3.speed(600);
        pablito4.speed(140);
        pablito5.speed(300);
        pablito7.penColor(Color.white);
        pablito7.speed(10000);
        pablito6.speed(10);
	    win.add(pablito7);
        win.add(pablito8);
        win.add(pablito2);
        win.add(pablito3);
        win.add(pablito4);
        win.add(pablito5);
        win.add(pablito6);
        win.add(pablito);
        win.add(carlitos);
        win.add(carlitos2);
        pablito7.jumpTo(-1000, 0);
        pablito7.move(2000);
        pablito7.turn(90);
        pablito7.jumpTo(0, -1000);
        pablito7.move(2000);
	    win.setVisible(true);
        int red[] = new int[4];
        red[1] = 250;
        red[2] = 0;
        red[3] = 0;
        int blue[] = new int[4];
        blue[1] = 0;
        blue[2] = 191;
        blue[3] = 255;
        int yellow[] = new int[4];
        yellow[1] = 255;
        yellow[2] = 230;
        yellow[3] = 0;
        int green[] = new int[4];
        green[1] = 0;
        green[2] = 250;
        green[3] = 0;
        N_E_C_A_S.char_N(pablito2, blue[1], blue[2], blue[3]);
        N_E_C_A_S.char_E(pablito2, blue[1], blue[2], blue[3]);
        N_E_C_A_S.char_C(pablito2, yellow[1], yellow[2], yellow[3]);
        N_E_C_A_S.char_E(pablito2, yellow[1], yellow[2], yellow[3]);
        N_E_C_A_S.char_S(pablito2, red[1], red[2], red[3]);
        M_I_T_Z.letraI(pablito2, 240, -5, 1200, red[1], red[2], red[3]);
        M_I_T_Z.letraT(pablito2, 315, -5, 1200, green[1], green[2], green[3]);
        pablito2.turn(-180);
        pablito2.jumpTo(360, 0);
        N_E_C_A_S.char_A(pablito2, green[1], green[2], green[3]);
        M_I_T_Z.letraM(pablito2, 410, -1, 1200,yellow[1], yellow[2], yellow[3]);
        O_D_L_Q.letraO(pablito2, 470, -1,yellow[1], yellow[2], yellow[3]);
        pablito2.turn(90);
        pablito2.jumpTo(520, 0);
        N_E_C_A_S.char_S(pablito2, blue[1], blue[2], blue[3]);
        pablito2.jumpTo(600, 0);
        N_E_C_A_S.char_A(pablito2, blue[1], blue[2], blue[3]);
        pablito3.jumpTo(-50, -75);
        N_E_C_A_S.char_A(pablito3, yellow[1], yellow[2], yellow[3]);
        O_D_L_Q.letraL(pablito3, 10, -75,yellow[1], yellow[2], yellow[3]);
        pablito3.jumpTo(64, -85);
        pablito3.penColor(new Color(red[1], red[2], red[3]));
        LetrasUPRG.letraG(pablito3, red[1], red[2], red[3]);
        pablito3.jumpTo(125, -83);
        LetrasUPRG.letraU(pablito3, red[1], red[2], red[3]);
        M_I_T_Z.letraI(pablito3, 175, -80, 1200, green[1], green[2], green[3]);
        pablito3.turn(90);
        pablito3.jumpTo(240, -75);
        N_E_C_A_S.char_E(pablito3, green[1], green[2], green[3]);
        N_E_C_A_S.char_N(pablito3, yellow[1], yellow[2], yellow[3]);
        O_D_L_Q.letraQ(pablito3, 370, -76,yellow[1], yellow[2], yellow[3]);
        pablito3.jumpTo(420, -78);
        pablito3.penColor(new Color(blue[1], blue[2], blue[3]));
        LetrasUPRG.letraU(pablito3, blue[1], blue[2], blue[3]);
        pablito3.jumpTo(490, -72);
        N_E_C_A_S.char_E(pablito3, blue[1], blue[2], blue[3]);
        pablito3.jumpTo(560, -72);
        N_E_C_A_S.char_N(pablito3, yellow[1], yellow[2], yellow[3]);
        O_D_L_Q.letraO(pablito3, 610, -76,yellow[1], yellow[2], yellow[3]);
        pablito3.jumpTo(660, -72);
        N_E_C_A_S.char_S(pablito3, red[1], red[2], red[3]);
        pablito4.jumpTo(30, -150);
        N_E_C_A_S.char_C(pablito4, red[1], red[2], red[3]);
        O_D_L_Q.letraO(pablito4, 85, -155,green[1], green[2], green[3]);
        M_I_T_Z.letraM(pablito4, 135, -150, 1200, green[1], green[2], green[3]);
        pablito4.turn(90);
        pablito4.jumpTo(190, -155);
        pablito4.penColor(new Color(yellow[1], yellow[2], yellow[3]));
        LetrasUPRG.letraP(pablito4, yellow[1], yellow[2], yellow[3]);
        pablito4.jumpTo(250, -150);
        N_E_C_A_S.char_A(pablito4, yellow[1], yellow[2], yellow[3]);
        pablito4.jumpTo(300, -153);
        pablito4.penColor(new Color(blue[1], blue[2], blue[3]));
        LetrasUPRG.letraR(pablito4, blue[1], blue[2], blue[3]);    
        M_I_T_Z.letraT(pablito4, 350, -160, 1200, blue[1], blue[2], blue[3]); 
        pablito4.jumpTo(416, -136);
        pablito4.turn(90);
        N_E_C_A_S.char_A(pablito4, yellow[1], yellow[2], yellow[3]);
        pablito4.jumpTo(490, -145);
        pablito4.penColor(new Color(yellow[1], yellow[2], yellow[3]));
        N_E_C_A_S.char_S(pablito4, yellow[1], yellow[2], yellow[3]);
        pablito4.jumpTo(540, -155);  
        pablito4.penColor(new Color(red[1], red[2], red[3]));
        LetrasUPRG.letraU(pablito4, red[1], red[2], red[3]);
        pablito5.jumpTo(-50, -220);  
        N_E_C_A_S.char_C(pablito5, red[1], red[2], red[3]); 
        O_D_L_Q.letraO(pablito5, 03, -223, green[1], green[2], green[3]);
        pablito5.jumpTo(60, -220); 
        N_E_C_A_S.char_N(pablito5, green[1], green[2], green[3]);
        O_D_L_Q.letraO(pablito5, 110, -223,yellow[1], yellow[2], yellow[3]);
        pablito5.jumpTo(160, -217); 
        N_E_C_A_S.char_C(pablito5, yellow[1], yellow[2], yellow[3]);
        M_I_T_Z.letraI(pablito5, 200, -223, 1200, blue[1], blue[2], blue[3]);
        pablito5.turn(90); 
        M_I_T_Z.letraM(pablito5, 255, -217, 1200, blue[1], blue[2], blue[3]);
        M_I_T_Z.letraI(pablito6, 294, -220, 27, yellow[1], yellow[2], yellow[3]);
        pablito5.turn(90); 
        pablito5.jumpTo(355, -215);
        N_E_C_A_S.char_E(pablito5, yellow[1], yellow[2], yellow[3]);
        pablito5.jumpTo(405, -215);
        N_E_C_A_S.char_N(pablito5, red[1], red[2], red[3]);
        pablito5.jumpTo(455, -215);
        M_I_T_Z.letraT(pablito5, 450, -225, 1200, red[1], red[2], red[3]);
        O_D_L_Q.letraO(pablito5, 515, -220,green[1], green[2], green[3]);
        pablito5.jumpTo(580, -210);
        pablito5.turn(90);
        N_E_C_A_S.char_Y(pablito5, green[1], green[2], green[3]);
        carlitos2.jumpTo(0, -300);
        carlitos2.penColor(new Color(yellow[1], yellow[2], yellow[3]));
        LetrasUPRG.letraP(carlitos2, green[1], green[2], green[3]);
        pablito7.turn(-90);
        pablito7.jumpTo(0, -300);
        LetrasUPRG.letraP(pablito7, green[1], green[2], green[3]);
        N_E_C_A_S.char_A(pablito7, yellow[1], yellow[2], yellow[3]);
        N_E_C_A_S.char_S(pablito7, blue[1], blue[2], blue[3]);
        M_I_T_Z.letraI(pablito7, 140, -300, 1200, blue[1], blue[2], blue[3]);
        O_D_L_Q.letraO(pablito7, 200, -300,yellow[1], yellow[2], yellow[3]);
        pablito7 .turn(90);
        pablito7.jumpTo(250, -300);
        N_E_C_A_S.char_N(pablito7, yellow[1], yellow[2], yellow[3]);
        pablito7.jumpTo(320, -300);
        pablito7.penColor(new Color(red[1], red[2], red[3]));
        LetrasUPRG.letraP(pablito7, red[1], red[2], red[3]);
        O_D_L_Q.letraO(pablito7, 373, -300,red[1], red[2], red[3]);
        pablito7.jumpTo(420, -300);
        pablito7.penColor(new Color(green[1], green[2], green[3]));
        LetrasUPRG.letraR(pablito7, green[1], green[2], green[3]);  
        O_D_L_Q.letraL(pablito7, 498, -293,green[1], green[2], green[3]);
        pablito7.jumpTo(545, -295);    
        N_E_C_A_S.char_A(pablito7, yellow[1], yellow[2], yellow[3]);
        pablito8.jumpTo(-10, -385);
        pablito8.penColor(new Color(yellow[1], yellow[2], yellow[3]));
        LetrasUPRG.letraP(pablito8, yellow[1], yellow[2], yellow[3]);
        pablito8.jumpTo(50, -395);
        pablito8.penColor(new Color(blue[1], blue[2], blue[3]));
        LetrasUPRG.letraR(pablito8, blue[1], blue[2], blue[3]);  
        O_D_L_Q.letraO(pablito8, 110, -385,blue[1], blue[2], blue[3]);
        pablito8.jumpTo(160, -395);
        pablito8.penColor(new Color(yellow[1], yellow[2], yellow[3]));
        LetrasUPRG.letraG(pablito8, yellow[1], yellow[2], yellow[3]);
        pablito8.jumpTo(220, -385);
        pablito8.penColor(new Color(yellow[1], yellow[2], yellow[3]));
        LetrasUPRG.letraR(pablito8, yellow[1], yellow[2], yellow[3]); 
        pablito8.jumpTo(282, -375);    
        N_E_C_A_S.char_A(pablito8, red[1], red[2], red[3]);
        M_I_T_Z.letraM(pablito8, 330, -385, 1200, red[1], red[2], red[3]);
        pablito8.jumpTo(380, -375);
        pablito8.turn(90);    
        N_E_C_A_S.char_A(pablito8, green[1], green[2], green[3]);
        N_E_C_A_S.char_C(pablito8, green[1], green[2], green[3]);
        M_I_T_Z.letraI(pablito8, 470, -390, 1200, yellow[1], yellow[2], yellow[3]);
        O_D_L_Q.letraO(pablito8, 530, -385,yellow[1], yellow[2], yellow[3]);
        pablito8.jumpTo(580, -375);
        pablito8.turn(90);    
        N_E_C_A_S.char_N(pablito8, blue[1], blue[2], blue[3]);
        Logo.pintarImagen(win, carlitos,6, 800,700 ,-30);

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                Leo.pintarFoto(win, 670, -230);
            }
        };
    timer.schedule(task, 7820);
    
    }
}
