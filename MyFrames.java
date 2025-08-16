import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;

public class MyFrames {
    public static final int TOTAL_FRAMES = 120;
    public static final Consumer<BufferedImage>[] FRAMES = new Consumer[TOTAL_FRAMES];
    public static final Consumer<BufferedImage>[] BACKGROUND_FRAMES = new Consumer[TOTAL_FRAMES];

//     static {
//     int totalFrames = 120;
//     for (int i = 0; i < totalFrames; i++) {
//         int frameIndex = (i/4) % 17;  // 17 เฟรมทั้งหมด แช่ภาพละ 5 เฟรม

//         switch(frameIndex) {
//             // Potato ก่อน
//             case 0:  FRAMES[i] = Potatoframe1(); break;
//             case 1:  FRAMES[i] = Potatoframe2(); break;
//             case 2:  FRAMES[i] = Potatoframe3(); break;
//             case 3:  FRAMES[i] = Potatoframe4(); break;
//             case 4:  FRAMES[i] = Potatoframe5(); break;
//             case 5:  FRAMES[i] = Potatoframe6(); break;
//             case 6:  FRAMES[i] = Potatoframe7(); break;

//             // Gojo ต่อ
//             case 7:  FRAMES[i] = Gojo1(); break;
//             case 8:  FRAMES[i] = Gojo2(); break;
//             case 9:  FRAMES[i] = Gojo3(); break;
//             case 10: FRAMES[i] = Gojo4(); break;
//             case 11: FRAMES[i] = Gojo5(); break;
//             case 12: FRAMES[i] = Gojo6(); break;
//             case 13: FRAMES[i] = Gojo7(); break;
//             case 14: FRAMES[i] = Gojo8(); break;
//             case 15: FRAMES[i] = Gojo9(); break;
//             case 16: FRAMES[i] = Gojo10(); break;
//         }
//     }
// }


static {
    for (int i = 0; i < TOTAL_FRAMES; i++) {
        if (i < 17) {
            FRAMES[i] = Heven1();
        } 
        // else if (i < 34) {
        //     FRAMES[i] = Potatoframe2();
        // } else if (i < 51) {
        //     FRAMES[i] = Potatoframe3();
        // } else if (i < 68) {
        //     FRAMES[i] = Potatoframe4();
        // } else {
        //     int phase = (i - 68) % 3;
        //     if (phase == 0) FRAMES[i] = Potatoframe5();
        //     else if (phase == 1) FRAMES[i] = Potatoframe6();
        //     else FRAMES[i] = Potatoframe7();
        // }
    }
} 


    private static Consumer<BufferedImage> background1() {
    return image -> {
        
        Graphics2D g = image.createGraphics();
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 600, 600);
        g.dispose();
    };
}



    //frame1 
    private static Consumer<BufferedImage> Potatoframe1() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,387,336,409,358,387,390,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,387,390,382,391,382,402,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,402,386,406,389,403,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,389,403,390,395,387,390,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 400, Color.WHITE, Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,342,154,384,175,409,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,409,173,421,174,429,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,429,180,429,182,417,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,182,417,180,412,175,409,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 178, 420, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 274, 377, 282, 374, 291, 376, Color.BLACK, 2f);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

        };
    }

    private static Consumer<BufferedImage> Potatoframe2() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 600, 600);
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 386, 335, 399, 360, 409, 389, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 409, 389, 415, 387, 423, 392, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,423,392,421,397,415,397,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,397,411,395,409,389,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 417, 393, Color.WHITE, Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,342,154,384,175,409,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,409,173,421,174,429,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,429,180,429,182,417,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,182,417,180,412,175,409,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 178, 420, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 271, 375, 283, 377, 291, 374, Color.BLACK, 2f);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            
        };
    }
    
    private static Consumer<BufferedImage> Potatoframe3() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 600, 600);
            
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);

            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 386, 335, 401, 360, 428, 376, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 428, 376, 435, 367, 440, 367, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,367,442,373,434,381,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,434,381,428,376,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 435, 374, Color.WHITE, Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,342,154,384,175,409,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,409,173,421,174,429,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,429,180,429,182,417,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,182,417,180,412,175,409,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 178, 420, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 377, 280, 377, 299, 372, Color.BLACK, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 299, 367, 299, 372, 302, 374, Color.BLACK, 2f);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);


        };
    }
    private static Consumer<BufferedImage> Potatoframe4() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtilsPolygonOnly.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtilsPolygonOnly.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);



        };
    }
    private static Consumer<BufferedImage> Potatoframe5() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            
            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,218,310,233,305,253,310,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,299,304,318,298,336,305,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 234, 328, 234, 314, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawLine(g, 316, 324, 316, 311, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 305, 319, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtilsPolygonOnly.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtilsPolygonOnly.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            //slash
            GraphicsUtilsPolygonOnly.drawLine(g, -11, -4, 599, 601, Color.black, 2.5f);
        };
    }
    private static Consumer<BufferedImage> Potatoframe6() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,218,310,233,305,253,310,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,299,304,318,298,336,305,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 234, 328, 234, 314, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawLine(g, 316, 324, 316, 311, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 305, 319, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtilsPolygonOnly.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtilsPolygonOnly.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            //slash
            GraphicsUtilsPolygonOnly.drawLine(g, 599, 1, -2, 601, Color.black, 2.5f);

        };
    }
    private static Consumer<BufferedImage> Potatoframe7() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //eyes
            GraphicsUtilsPolygonOnly.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,218,310,233,305,253,310,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,299,304,318,298,336,305,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 234, 328, 234, 314, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtilsPolygonOnly.drawLine(g, 316, 324, 316, 311, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 305, 319, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtilsPolygonOnly.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtilsPolygonOnly.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtilsPolygonOnly.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtilsPolygonOnly.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtilsPolygonOnly.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtilsPolygonOnly.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtilsPolygonOnly.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtilsPolygonOnly.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtilsPolygonOnly.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtilsPolygonOnly.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtilsPolygonOnly.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtilsPolygonOnly.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtilsPolygonOnly.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtilsPolygonOnly.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            //slash
            // GraphicsUtilsPolygonOnly.drawLine(g, 599, 1, -2, 601, Color.black, 7f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 1, 353, 601, Color.black, 2.5f);

        };
    }
    private static Consumer<BufferedImage> Gojo1() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
           //floor 1 line(left)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,406,31,406,50,405,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,50,405,69,403,68,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,403,80,404,86,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,86,403,94,402,100,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,403,108,402,118,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,403,125,402,135,405,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,135,405,155,405,Color.black,1.5f); //เชื่อม body
            // floor 2 line(right)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,399,399,420,401,433,401,Color.black,1.5f); // เชื่อม body
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,433,401,454,400,470,397,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,470,397,484,393,496,394,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,496,394,512,393,522,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,395,559,394,575,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,395,587,397,600,396,Color.black,1.5f);
            //floor 3 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,26,469,32,466,37,468,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,37,468,40,470,44,468,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,90,571,88,568,90,567,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,90,567,93,566,96,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,567,100,568,104,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,182,532,187,529,193,530,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,530,199,532,203,530,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,203,530,205,529,207,530,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,207,530,212,531,214,529,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,214,529,218,528,220,530,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,302,577,310,575,315,578,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,578,323,581,330,577,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,473,406,471,411,472,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,411,472,415,473,421,471,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,493,538,498,535,501,537,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,537,505,539,510,539,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,504,448,510,444,516,446,Color.black,1.5f); //7
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,516,446,523,447,528,446,Color.black,1.5f);
            //floor 4 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,526,48,522,52,517,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,52,517,61,513,75,513,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,513,81,519,79,524,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,524,64,526,53,526,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,95,436,90,434,92,431,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,92,431,104,427,109,429,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,429,112,431,111,434,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,111,434,105,435,95,436,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,497,513,493,511,495,508,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,508,500,506,509,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,506,516,510,515,516,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,516,509,517,497,513,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,559,424,553,422,553,420,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,553,420,559,417,572,419,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,572,419,576,422,573,424,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,573,424,568,425,559,424,Color.black,1.5f);
            
        // Tree 1
            //1.1 branch down
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,225,20,238,38,225,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,225,51,238,69,225,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,69,225,80,241,108,225,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,108,225,121,238,141,228,Color.black,1.5f); //เชื่อม hair
            //1.2 branch right
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,104,0,114,8,111,25,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,111,25,130,28,132,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,132,45,147,61,144,82,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,82,160,85,167,105,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,167,105,180,109,183,135,Color.black,1.5f); //เชื่อม hair
            //1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,31,37,40,45,49,37,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,49,37,54,45,69,34,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,20,109,25,117,36,112,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,36,112,42,115,49,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,91,108,97,118,88,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,88,126,97,134,88,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,4,167,14,169,17,164,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,164,22,168,29,166,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,64,194,73,201,84,192,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,192,90,200,96,195,Color.black,1.5f);
            //1.4 trunk1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,31,406,30,391,31,384,Color.black,1.5f); //เชื่อม floor1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,31,384,33,338,31,277,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,31,277,33,255,33,228,Color.black,1.5f); //เชื่อม 1.1 branch down
            //1.5 trunk2 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,80,404,76,321,80,234,Color.black,1.5f); //เชื่อม dirt1 + 1.1 branch down
        //Tree 2
            //2.1 branch down 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,235,425,248,440,244,Color.black,1.5f); //เชื่อม hair
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,244,446,253,466,244,Color.black,1.5f); //เชื่อม คำ ด้านซ้าย
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,247,560,255,576,242,Color.black,1.5f); //เชื่อม คำ ด้านขวา
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,576,242,585,252,600,238,Color.black,1.5f);
            //2.2 branch left
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,0,465,8,464,22,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,464,22,440,34,447,42,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,447,42,430,52,425,70,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,70,403,81,403,106,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,106,387,116,392,134,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,392,134,375,137,364,154,Color.black,1.5f); //เชื่อม hair
            //2.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,511,42,520,50,527,43,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,43,534,50,541,43,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,445,107,451,114,462,107,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,462,107,468,113,475,106,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,561,87,569,92,577,85,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,85,583,92,592,89,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,134,514,137,520,129,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,129,523,140,534,135,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,534,135,540,140,544,135,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,444,179,450,187,461,177,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,461,177,470,185,482,177,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,558,188,566,198,574,191,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,191,576,198,588,197,Color.black,1.5f);
            //2.4 trunk1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,511,394,513,364,513,338,Color.black,1.5f); //เชื่อม คำ
            //2.5 trunk2 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,560,394,559,356,561,329,Color.black,1.5f); //เชื่อม floor2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,561,329,561,288,566,250,Color.black,1.5f); //เชื่อม 2.1 branch down
        //Tree 3
            //3.1 left 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,155,84,156,69,176,53,Color.black,1.5f); //เชื่อม 1.2 branch right
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,176,53,172,42,188,33,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,188,33,186,20,205,11,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,205,11,203,7,211,0,Color.black,1.5f);
            //3.2 right
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,333,0,350,16,345,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,345,31,365,34,363,57,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,363,57,377,57,371,80,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,371,80,387,81,386,104,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,104,393,105,396,110,Color.black,1.5f); //เชื่อม 2.2 branch left
            //3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,225,28,234,32,239,26,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,239,26,244,32,251,26,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,306,46,313,50,318,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,318,45,326,51,334,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,230,78,238,85,245,79,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,245,79,247,85,254,81,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,281,105,287,112,294,108,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,340,102,349,105,355,100,Color.black,1.5f);
        //Tree 4
            //4.1 left 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,123,27,127,18,139,14,Color.black,1.5f); //เชื่อม 1.2 branch right
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,139,14,137,5,150,0,Color.black,1.5f);
            //4.2 right 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,179,0,186,3,188,10,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,188,10,196,7,200,13,Color.black,1.5f); //เชื่อม 3.1 branch left
            //4.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,20,147,22,152,19,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,158,32,161,37,167,34,Color.black,1.5f);
            //4.4 Trunk1 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,146,313,144,268,146,239,Color.black,1.5f); //เชื่อม hair+body
            GraphicsUtilsPolygonOnly.drawLine(g,149,379,149,354,Color.black,1.5f); //เชื่อม body ล่าง
            GraphicsUtilsPolygonOnly.drawLine(g,148,336,147,324,Color.black,1.5f); //เชื่อม body บน
        //Tree 5
            // 5.1 left 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,370,60,381,45,398,41,Color.black,1.5f); //เชื่อม 3.2 branch right
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,41,394,28,409,25,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,25,404,15,421,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,421,8,420,2,424,0,Color.black,1.5f);
            // 5.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,427,20,435,22,440,17,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,62,390,65,395,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,395,62,398,66,403,61,Color.black,1.5f);   
            //5.3 trunk1 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,450,400,448,344,448,309,Color.black,1.5f); //เชื่อม floor2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,448,309,452,275,452,250,Color.black,1.5f); //เชื่อม 2.1 branch down
            //5.4 trunk2 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,394,488,258,488,328,Color.black,1.5f); //เชื่อม dirt2 + 2.1 branch down
            


            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
                        //mouse 
                        GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
                        GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 108, 399, 156, 433, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 156, 433, 150, 442, 158, 445, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 158, 445, 163, 435, 156, 433, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 156, 438, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 469, 376, 419, 408, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 419, 408, 428, 420, 422, 430, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 430, 412, 422, 419, 408, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 419, 415, Color.white, Color.black, 230);


        };
    }
    private static Consumer<BufferedImage> Gojo2() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 469, 376, 419, 408, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 419, 408, 428, 420, 422, 430, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 430, 412, 422, 419, 408, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 419, 415, Color.white, Color.black, 230);

        };
    }
    private static Consumer<BufferedImage> Gojo3() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 384, 338, Color.black,2f);
            

        };
    }
    private static Consumer<BufferedImage> Gojo4() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 379, 314, Color.black,2f);
            
        };
    }
    private static Consumer<BufferedImage> Gojo5() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 373, 301, Color.black,2f);
            

        };
    }
    private static Consumer<BufferedImage> Gojo6() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //branch1.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            // GraphicsUtilsPolygonOnly.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCubicCurve(g,325,318,340,276,392,274,402,306,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 291, 284, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 392, 274, Color.black,2f);
            
            //eyes
            // GraphicsUtilsPolygonOnly.drawCubicCurve(g,344,289,353,306,382,306,394,282,Color.black,2f);
            // GraphicsUtilsPolygonOnly.floodFill(image, 345, 310, Color.white,Color.decode("#98EF92"), 10);
            
        };
    }
    private static Consumer<BufferedImage> Gojo7() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            // GraphicsUtilsPolygonOnly.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCubicCurve(g,325,318,340,276,392,274,402,306,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 291, 284, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 392, 274, Color.black,2f);
            
            //eyes
            // GraphicsUtilsPolygonOnly.drawCubicCurve(g,344,289,353,306,382,306,394,282,Color.black,2f);
            // GraphicsUtilsPolygonOnly.floodFill(image, 345, 310, Color.white,Color.decode("#98EF92"), 10);
            

        };
    }
    private static Consumer<BufferedImage> Gojo8() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            // GraphicsUtilsPolygonOnly.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 325, 318, 308, 280, 324, 253, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 324, 253, 358, 246, 391, 251, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 391, 251, 402, 277, 402, 306, Color.black,2f);
            // GraphicsUtilsPolygonOnly.drawCubicCurve(g,325,318,340,276,392,274,402,306,Color.black,2f);


            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 291, 284, Color.white, Color.decode("#18191E"), 200);

            // GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            // GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            // GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            // GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 391, 251, Color.black,2f);
            
            //eyes
            // GraphicsUtilsPolygonOnly.drawCubicCurve(g,344,289,353,306,382,306,394,282,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g,357,282,30,Color.black,2f);
            // GraphicsUtilsPolygonOnly.floodFill(image, 345, 310, Color.white,Color.decode("#98EF92"), 10);
            


        };
    }

    private static Consumer<BufferedImage> Gojo9() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtilsPolygonOnly.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#18191E") , 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 357, 260, 373, 266, Color.decode("#18191E"), 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#18191E"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#18191E"), 90);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#18191E"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#18191E"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#18191E"),4f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#18191E"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#18191E"),2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#18191E"),2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#18191E"), 90);

            //hair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtilsPolygonOnly.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 177, 239, Color.white, Color.decode("#18191E"), 100);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 233, 241, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 303, 232, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtilsPolygonOnly.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 343, 235, Color.white, Color.decode("#18191E"), 60);

            GraphicsUtilsPolygonOnly.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 379, 232, Color.white, Color.decode("#18191E"), 120);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 212, 244, Color.white, Color.decode("#18191E"), 180);
            //leg
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#18191E"),1.5f);
            GraphicsUtilsPolygonOnly.floodFill(image, 252, 361, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#18191E"),1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g, 341, 439, 221, 481, Color.decode("#18191E"), 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 308, 421, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtilsPolygonOnly.floodFill(image, 335, 473, Color.white, Color.decode("#18191E"), 180);
            GraphicsUtilsPolygonOnly.floodFill(image, 356, 424, Color.white, Color.decode("#18191E"), 180);
            //arms 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtilsPolygonOnly.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 422, 353, 478, 390, 379, 314, Color.black,2f);
            
            //slash

            GraphicsUtilsPolygonOnly.drawLine(g, -15, 419, 619, 325, Color.decode("#18191E"), 2.5f);

        };
    }

    private static Consumer<BufferedImage> Gojo10() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            GraphicsUtilsPolygonOnly.drawLine(g, 110, 322, 78, 216, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 78, 216, 119, 126, 251, 121, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 251, 121, 327, 247, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 110, 322, 327, 247, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 209, 251, Color.white, Color.black, 180);

            GraphicsUtilsPolygonOnly.drawLine(g, 163, 425, 378, 380, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 425, 378, 380, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 163, 425, 188, 517, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 188, 517, 311, 530, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 311, 530, 400, 465, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 400, 465, 378, 380, Color.black, 2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 274, 436, Color.white, Color.black, 180);
            //leg
            GraphicsUtilsPolygonOnly.drawLine(g, 227, 521, 227, 564, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 227, 564, 209, 564, 201, 573, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 201, 573, 218, 578, 227, 564, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 211, 569, Color.white, Color.black, 180);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 373, 485, 386, 523, 386, 564, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 386, 564, 400, 564, 408, 573, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 408, 573, 392, 576, 386, 564, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image, 397, 567, Color.white, Color.black, 180);

            GraphicsUtilsPolygonOnly.drawLine(g, -15, 419, 619, 325, Color.decode("#18191E"), 2.5f);

        };
    }

    private static Consumer<BufferedImage> Gojo11() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            

        };
    }

    private static Consumer<BufferedImage> Gojo12() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            

        };
    }

    private static Consumer<BufferedImage> Gojo13() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            

        };
    }

    private static Consumer<BufferedImage> NahIwin() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            

        };
    }

    private static Consumer<BufferedImage> Heven1() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //door 1 wall
            GraphicsUtilsPolygonOnly.drawLine(g,127,229,127,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,127,85,188,36,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,36,243,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,243,85,243,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,243,229,127,229,Color.black,1.5f);
            //door 2 shadow
            GraphicsUtilsPolygonOnly.drawLine(g,188,36,254,84,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,254,84,254,224,Color.black,1.5f); //เชื่อม cloud right 1
            //door 3 diamond
            GraphicsUtilsPolygonOnly.drawLine(g,188,36,188,53,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,53,178,67,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,178,67,188,82,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,82,198,67,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,198,67,188,53,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,53,188,67,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,183,58,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,178,67,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,182,73,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,186,78,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,188,82,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,192,74,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,198,67,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawLine(g,188,67,193,59,Color.black,1.5f);
            //door 4 inside
            GraphicsUtilsPolygonOnly.drawLine(g,156,229,156,100,Color.black,1.5f); //เชื่อม wall
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,156,100,168,87,188,82,Color.black,1.5f); //เชื่อม diamond
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,188,82,208,87,220,100,Color.black,1.5f); //เชื่อม diamond
            GraphicsUtilsPolygonOnly.drawLine(g,220,100,220,229,Color.black,1.5f); //เชื่อม wall
            // door 5 path left (ทุกเส้นเชื่อมตัวละคร)
            GraphicsUtilsPolygonOnly.drawLine(g,0,316,37,290,Color.black,1.5f); //purple 
            GraphicsUtilsPolygonOnly.drawLine(g,45,286,127,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,325,39,297,Color.black,1.5f); //blue  
            GraphicsUtilsPolygonOnly.drawLine(g,53,286,130,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,339,41,306,Color.black,1.5f); //navy 
            GraphicsUtilsPolygonOnly.drawLine(g,63,288,134,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,355,42,317,Color.black,1.5f); //green 
            GraphicsUtilsPolygonOnly.drawLine(g,64,298,138,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,373,44,329,Color.black,1.5f); //yellow 
            GraphicsUtilsPolygonOnly.drawLine(g,60,313,142,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,394,47,342,Color.black,1.5f); // orange 
            GraphicsUtilsPolygonOnly.drawLine(g,58,329,148,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,414,48,355,Color.black,1.5f); //red 
            GraphicsUtilsPolygonOnly.drawLine(g,56,346,152,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,0,443,156,229,Color.black,1.5f); //พรม
            // door 6 path right (ทุกเส้นเชื่อมตัวละคร)
            GraphicsUtilsPolygonOnly.drawLine(g,600,335,493,303,Color.black,1.5f); // purple 
            GraphicsUtilsPolygonOnly.drawLine(g,323,253,243,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,339,497,308,Color.black,1.5f); // blue 
            GraphicsUtilsPolygonOnly.drawLine(g,321,254,240,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,345,500,313,Color.black,1.5f); // navy 
            GraphicsUtilsPolygonOnly.drawLine(g,321,256,237,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,353,488,315,Color.black,1.5f); // green
            GraphicsUtilsPolygonOnly.drawLine(g,324,259,234,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,363,492,323,Color.black,1.5f); // yellow 
            GraphicsUtilsPolygonOnly.drawLine(g,336,267,231,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,374,492,331,Color.black,1.5f); // orange 
            GraphicsUtilsPolygonOnly.drawLine(g,334,270,228,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,385,492,340,Color.black,1.5f); //red 
            GraphicsUtilsPolygonOnly.drawLine(g,323,270,224,229,Color.black,1.5f); 
            GraphicsUtilsPolygonOnly.drawLine(g,600,400,492,351,Color.black,1.5f); //พรม
            GraphicsUtilsPolygonOnly.drawLine(g,327,277,220,229,Color.black,1.5f);
            // door 7 sun
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,151,66,120,33,138,0,Color.black,1.5f); //เชื่อม wall 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,235,70,278,38,258,0,Color.black,1.5f); //เชื่อม shadow
        // Cloud left
            //cloud left 1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,0,216,19,212,21,224,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,21,224,41,227,44,241,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,44,241,59,233,72,241,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,72,241,80,224,105,229,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,105,229,112,220,127,222,Color.black,1.5f);
            //cloud left 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,9,121,21,119,30,127,Color.black,1.5f); //2.1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,30,127,39,121,50,126,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,50,126,73,109,84,123,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,84,123,97,123,102,132,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,102,132,115,135,114,143,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,114,143,120,146,118,158,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,118,158,123,150,127,150,Color.black,1.5f); //เชื่อม wall
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,47,0,51,7,38,24,Color.black,1.5f); //2.2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,38,24,60,25,63,33,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,63,33,78,52,65,66,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,65,66,87,85,73,117,Color.black,1.5f); //เชื่อม cloud left 2.1
            //cloud left 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,89,123,97,104,109,109,Color.black,1.5f); //เชื่อม cloud left 2.1
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,109,109,115,104,127,107,Color.black,1.5f); //เชื่อม wall
        // Cloud right
            // cloud right 1    
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,243,229,254,220,262,229,Color.black,1.5f); //เชื่อม wall + shadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,262,229,281,213,291,224,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,291,224,300,217,305,231,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,305,231,311,223,318,232,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,318,232,320,236,330,224,Color.black,1.5f); //เชื่อม body
            // cloud right 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,491,225,511,218,523,229,Color.black,1.5f); //เชื่อม body
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,523,229,532,221,545,230,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,545,230,557,217,575,223,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,575,223,587,214,597,217,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,597,217,597,214,600,212,Color.black,1.5f);
            // cloud right 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,189,256,153,274,173,Color.black,1.5f); //เชื่อม wall
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,274,173,274,157,288,155,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,288,155,284,146,297,141,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,297,141,297,129,308,133,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,308,133,308,111,337,104,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,337,104,334,84,360,85,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,360,85,379,69,398,89,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,398,89,408,81,413,94,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,413,94,419,79,435,77,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,435,77,445,69,454,89,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,454,89,469,73,484,84,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,484,84,501,73,508,91,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,508,91,513,75,527,73,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,527,73,527,63,537,61,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,537,61,529,39,548,28,Color.black,1.5f); //เชื่อม cloud right 6
            // cloud right 4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,519,224,523,201,545,199,Color.black,1.5f); //เชื่อม cloud right 2
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,545,199,542,174,557,166,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,557,166,554,153,568,148,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,568,148,564,135,586,130,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,586,130,578,118,588,114,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,588,114,592,105,600,108,Color.black,1.5f);
            // cloud right 5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,254,109,265,105,272,112,Color.black,1.5f); //เชื่อม shadow
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,272,112,274,109,278,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,278,109,278,96,292,98,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,292,98,304,85,315,88,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,315,88,325,76,336,95,Color.black,1.5f); //เชื่อม cloud right 3
            // cloud right 6
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,545,178,535,169,539,158,Color.black,1.5f); //เชื่อม cloud right 4
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,539,158,515,154,520,144,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,520,144,508,133,515,126,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,515,126,508,109,526,109,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,526,109,524,96,543,99,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,543,99,545,79,566,75,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,566,75,564,63,584,58,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,584,58,563,54,563,34,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,563,34,522,22,535,0,Color.black,1.5f); //เชื่อม cloud right 3
            // cloud right 7
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,86,298,62,316,40,Color.black,1.5f); //เชื่อม cloud right 5
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,316,40,308,21,330,16,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,330,16,325,2,338,0,Color.black,1.5f);
            // cloud right 8
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,368,78,354,70,367,60,Color.black,1.5f); //เชื่อม cloud right 3
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,367,60,364,46,378,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,378,44,388,34,396,44,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,396,44,409,37,415,46,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,415,46,422,29,442,34,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,442,34,450,23,459,29,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,459,29,455,15,467,11,Color.black,1.5f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g,467,11,462,4,474,0,Color.black,1.5f);

            //sukubody 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 151, 366, 139, 362, 116, 396, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 116, 396, 105, 406, 90, 414, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 90, 414, 94, 425, 104, 434, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 90, 414, 92, 433, 90, 449, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 90, 449, 66, 465, 43, 478, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 43, 478, 49, 493, 77, 502, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 77, 502, 125, 502, 159, 499, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 159, 499, 189, 509, 215, 509, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 215, 509, 232, 486, 215, 468, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 209, 483, 215, 468, 216, 457, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 216, 457, 205, 448, 180, 437, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 192, 442, 191, 426, 199, 411, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 199, 411, 197, 408, 192, 406, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 188, 415, 196, 386, 180, 381, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g,161,381,20,Color.black,2f);

            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 115, 434, 142, 428, 164, 446, Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 138, 476, 197, 463, 188, 486, Color.black,1f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 90, 449, 103, 468, 116, 475, Color.black,1f);
            GraphicsUtilsPolygonOnly.floodFill(image, 140, 461, Color.white, Color.decode("#FAB0A7"), 80);

            //sukueye
            GraphicsUtilsPolygonOnly.drawCircle(g,166,389,10,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image,161, 384, Color.white, Color.black, 80);

            //gojobody
            GraphicsUtilsPolygonOnly.drawLine(g, 335, 412, 313, 411, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 313, 411, 295, 428, 312, 447, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 312, 447, 337, 446, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 337, 446, 422, 453, 475, 441, Color.black,2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 475, 441, 502, 452, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 490, 409, 512, 417, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 512, 417, 514, 437, 502, 452, Color.black,2f);
            
            GraphicsUtilsPolygonOnly.drawLine(g, 490, 409, 490, 314, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 335,412, 335, 322, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 490,314, 503, 313, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 503,313, 490, 300, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 490,300, 503, 293, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 503,293, 491, 283, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 491,283, 507, 272, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 507,272, 493, 265, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 493,265, 493, 229, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 335,322, 319, 310, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 319,310, 331, 300, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 331,300, 317, 283, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 317,283, 332, 287, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 332,287, 321, 268, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 321,268, 332, 265, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 332,265, 332, 249, Color.black, 2f);

            GraphicsUtilsPolygonOnly.drawLine(g, 332,249, 329, 216, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 329, 216, 346, 184, 365, 199, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 365,199, 371, 227, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 371, 227, 408, 219, 446, 222, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 446,222, 459, 202, Color.black, 2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 459, 202, 485, 187, 496, 205, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawLine(g, 496,205, 493, 229, Color.black, 2f);

            //eyesgojo
            GraphicsUtilsPolygonOnly.drawCircle(g,377,272,22,Color.black,2f);
            GraphicsUtilsPolygonOnly.drawCircle(g,447,270,22,Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image,378, 276, Color.white, Color.decode("#172242"), 120);
            GraphicsUtilsPolygonOnly.floodFill(image,449, 271, Color.white, Color.decode("#172242"), 120);

            //gojoglasses
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 399, 274, 413, 270, 426, 272, Color.black,2f);

            //gojomouse 
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 398, 294, 414, 296, 427, 293, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 403, 295, 414, 327, 420, 294, Color.black,2f);
            GraphicsUtilsPolygonOnly.floodFill(image,413, 306, Color.white, Color.decode("#D7A3BB"), 80);

            //gojoarms
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 360, 349, 357, 386, 387, 351, Color.black,2f);
            GraphicsUtilsPolygonOnly.drawQuadCurve(g, 433, 347, 455, 380, 456, 346, Color.black,2f);

        };
    }
    


    public static void drawFrame(Graphics2D g, int index) {
    if (index >= 0 && index < TOTAL_FRAMES) {
        BufferedImage bgImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        if (BACKGROUND_FRAMES[index] != null) {
            BACKGROUND_FRAMES[index].accept(bgImage);
        }

        BufferedImage charImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        if (FRAMES[index] != null) {
            FRAMES[index].accept(charImage);
        }

        // วาดพื้นหลังก่อน
        g.drawImage(bgImage, 0, 0, null);
        // วาดตัวละครทับ
        g.drawImage(charImage, 0, 0, null);
    }
}


    
}
