import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;

public class MyFrames {
    public static final int TOTAL_FRAMES = 120;
    public static final Consumer<BufferedImage>[] FRAMES = new Consumer[TOTAL_FRAMES];
    public static final Consumer<BufferedImage>[] BACKGROUND_FRAMES = new Consumer[TOTAL_FRAMES];
//oom
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
            FRAMES[i] = Potatoframe5();
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
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtils.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g,387,336,409,358,387,390,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,387,390,382,391,382,402,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,402,386,406,389,403,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,389,403,390,395,387,390,Color.black,2f);
            GraphicsUtils.floodFill(image, 386, 400, Color.WHITE, Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,342,154,384,175,409,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,175,409,173,421,174,429,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,174,429,180,429,182,417,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,182,417,180,412,175,409,Color.black,2f);
            GraphicsUtils.floodFill(image, 178, 420, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse
            GraphicsUtils.drawQuadCurve(g, 274, 377, 282, 374, 291, 376, Color.BLACK, 2f);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

        };
    }

    private static Consumer<BufferedImage> Potatoframe2() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 600, 600);
            //branch1.1 line(up)
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtils.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g, 386, 335, 399, 360, 409, 389, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 409, 389, 415, 387, 423, 392, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,423,392,421,397,415,397,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,415,397,411,395,409,389,Color.black,2f);
            GraphicsUtils.floodFill(image, 417, 393, Color.WHITE, Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,342,154,384,175,409,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,175,409,173,421,174,429,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,174,429,180,429,182,417,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,182,417,180,412,175,409,Color.black,2f);
            GraphicsUtils.floodFill(image, 178, 420, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse
            GraphicsUtils.drawQuadCurve(g, 271, 375, 283, 377, 291, 374, Color.BLACK, 2f);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            
        };
    }
    
    private static Consumer<BufferedImage> Potatoframe3() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 600, 600);
            
            //branch1.1 line(up)
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);

            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtils.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g, 386, 335, 401, 360, 428, 376, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 428, 376, 435, 367, 440, 367, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,440,367,442,373,434,381,Color.black,2f);
            GraphicsUtils.drawLine(g,434,381,428,376,Color.black,2f);
            GraphicsUtils.floodFill(image, 435, 374, Color.WHITE, Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,342,154,384,175,409,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,175,409,173,421,174,429,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,174,429,180,429,182,417,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,182,417,180,412,175,409,Color.black,2f);
            GraphicsUtils.floodFill(image, 178, 420, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtils.drawQuadCurve(g, 261, 377, 280, 377, 299, 372, Color.BLACK, 2f);
            GraphicsUtils.drawQuadCurve(g, 299, 367, 299, 372, 302, 374, Color.BLACK, 2f);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);


        };
    }
    private static Consumer<BufferedImage> Potatoframe4() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //branch1.1 line(up)
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,216,314,236,313,253,319,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,298,315,314,310,337,311,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,232,314,232,322,235,325,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,235,325,240,323,241,316,Color.black,2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawQuadCurve(g,310,312,311,317,315,319,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,315,319,319,317,320,311,Color.black,2f);
            GraphicsUtils.floodFill(image, 315, 316, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtils.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtils.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtils.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtils.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtils.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtils.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtils.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtils.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtils.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtils.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtils.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtils.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtils.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtils.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtils.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtils.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtils.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtils.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);



        };
    }
    private static Consumer<BufferedImage> Potatoframe5() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            
            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,218,310,233,305,253,310,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,299,304,318,298,336,305,Color.black,2f);

            GraphicsUtils.drawLine(g, 234, 328, 234, 314, Color.black, 2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawLine(g, 316, 324, 316, 311, Color.black, 2f);
            GraphicsUtils.floodFill(image, 305, 319, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtils.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtils.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtils.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtils.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtils.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtils.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtils.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtils.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtils.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtils.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtils.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtils.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtils.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtils.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtils.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtils.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtils.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtils.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            //slash
            GraphicsUtils.drawLine(g, -11, -4, 599, 601, Color.black, 2.5f);
        };
    }
    private static Consumer<BufferedImage> Potatoframe6() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,218,310,233,305,253,310,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,299,304,318,298,336,305,Color.black,2f);

            GraphicsUtils.drawLine(g, 234, 328, 234, 314, Color.black, 2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawLine(g, 316, 324, 316, 311, Color.black, 2f);
            GraphicsUtils.floodFill(image, 305, 319, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtils.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtils.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtils.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtils.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtils.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtils.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtils.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtils.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtils.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtils.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtils.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtils.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtils.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtils.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtils.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtils.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtils.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtils.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            //slash
            GraphicsUtils.drawLine(g, 599, 1, -2, 601, Color.black, 2.5f);

        };
    }
    private static Consumer<BufferedImage> Potatoframe7() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //eyes
            GraphicsUtils.drawCircle(g, 235, 318, 20, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,218,310,233,305,253,310,Color.black,2f);
            GraphicsUtils.drawCircle(g, 317, 309, 21, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,299,304,318,298,336,305,Color.black,2f);

            GraphicsUtils.drawLine(g, 234, 328, 234, 314, Color.black, 2f);
            GraphicsUtils.floodFill(image, 236, 320, Color.WHITE, Color.red, 170);

            GraphicsUtils.drawLine(g, 316, 324, 316, 311, Color.black, 2f);
            GraphicsUtils.floodFill(image, 305, 319, Color.WHITE, Color.red, 170);
            
            //eyeB
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,294,290,308,282,325,278,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,257,291,247,287,231,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,252,297,247,294,240,293,Color.black,1f);
            GraphicsUtils.drawQuadCurve(g,300,292,308,284,318,284,Color.black,1f);
            GraphicsUtils.floodFill(image, 238, 306, Color.white,Color.decode("#EFC966"), 140);
            GraphicsUtils.floodFill(image, 317, 299, Color.white,Color.decode("#EFC966"), 140);
            //arm
            GraphicsUtils.drawQuadCurve(g, 384, 336, 412, 373, 382, 400, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 382, 400, 378, 387, 368, 383, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,368,383,368,395,373,403,Color.black,2f);
            GraphicsUtils.drawLine(g,373,403,382,400,Color.black,2f);
            GraphicsUtils.floodFill(image, 374, 395, Color.white,Color.black, 170);

            GraphicsUtils.drawQuadCurve(g,171,357,154,394,192,418,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,192,418,192,407,199,400,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,400,202,409,199,421,Color.black,2f);
            GraphicsUtils.drawLine(g,199,421,192,418,Color.black,2f);
            GraphicsUtils.floodFill(image, 197, 413, Color.WHITE, Color.black, 170);
            //hair

            GraphicsUtils.drawQuadCurve(g,185,304,178,316,171,326,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,171,326,155,326,133,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,133,323,148,319,156,315,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,156,315,165,307,172,299,Color.black,2f);
            GraphicsUtils.drawLine(g, 172, 299, 175, 294, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,175,295,166,299,161,300,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,161,300,149,300,127,296,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,127,296,141,293,150,289,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,141,293,150,289,158,283,Color.black,2f);
            GraphicsUtils.drawLine(g, 158, 283, 166, 277, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,158,283,148,281,135,277,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,135,277,122,269,110,260,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,110,260,102,250,96,240,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,96,240,118,248,139,249,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,155,255,139,249,129,243,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,129,243,120,237,112,225,Color.black,2f);
            GraphicsUtils.drawLine(g, 112, 225, 109, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,109,216,116,218,128,220,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,128,220,141,220,159,217,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,181,225,168,223,159,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,159,217,153,212,144,202,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,144,202,138,188,136,174,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,136,174,137,157,142,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,142,138,145,149,150,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,150,159,159,169,170,177,Color.black,2f);

            GraphicsUtils.drawLine(g, 178, 189, 170, 177, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,170,177,166,170,163,159,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,163,159,163,140,166,124,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,166,124,169,135,176,146,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,176,146,184,154,201,166,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,188,216,184,208,177,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,177,201,166,197,157,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,157,195,148,194,136,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,194,136,195,119,199,109,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,199,109,201,117,203,125,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,203,125,209,138,217,148,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,217,148,228,155,234,159,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,228,155,226,144,226,130,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,226,130,230,120,237,112,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,237,112,237,129,240,143,Color.black,2f);
            GraphicsUtils.drawLine(g, 240, 143, 251, 159, Color.black, 1.5f);
            //body

            GraphicsUtils.drawQuadCurve(g,173,325,171,354,173,383,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,173,383,179,411,197,443,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,197,443,214,461,245,480,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,245,480,260,484,280,486,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,280,486,297,486,313,484,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,313,484,331,477,346,467,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,346,467,359,452,369,434,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,369,434,378,411,382,394,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,382,394,385,375,386,357,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,386,357,386,340,386,327,Color.black,2f);
            GraphicsUtils.drawLine(g, 384, 311, 386, 327, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,248,154,251,147,253,137,Color.black,2f);
            GraphicsUtils.drawLine(g, 253, 137, 254, 120, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,254,120,257,124,259,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,259,131,260,140,259,145,Color.black,2f);
            GraphicsUtils.drawLine(g, 259, 145, 258, 155, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,258,155,262,148,265,134,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,265,134,266,121,266,109,Color.black,2f);
            GraphicsUtils.drawLine(g, 266, 109, 266, 99, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,266,99,273,108,278,117,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,278,117,281,128,281,142,Color.black,2f);

            GraphicsUtils.drawLine(g, 274, 156, 281, 142, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,281,142,301,129,313,119,Color.black,2f);
            GraphicsUtils.drawLine(g, 313, 119, 322, 106, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,322,106,322,116,316,131,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,296,162,307,142,316,131,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,131,327,117,336,103,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,336,103,340,119,339,138,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,339,138,334,153,319,173,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,334,153,356,139,373,120,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,373,120,373,136,371,151,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,371,151,365,164,357,173,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,365,164,389,159,411,143,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,411,143,408,161,395,182,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,182,384,189,378,194,Color.black,2f);
            GraphicsUtils.drawLine(g, 378, 194, 373, 202, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,395,182,404,186,439,180,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,439,180,430,199,418,209,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,418,209,430,219,437,232,Color.black,2f);
            GraphicsUtils.drawLine(g, 437, 232, 442, 248, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,442,248,432,241,421,235,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,421,235,411,231,403,229,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,411,231,416,243,423,251,Color.black,2f);
            GraphicsUtils.drawLine(g, 423, 251, 437, 261, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,437,261,430,263,418,261,Color.black,2f);
            GraphicsUtils.drawLine(g, 418, 261, 402, 252, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g,402,252,408,261,416,271,Color.black,2f);
            GraphicsUtils.drawLine(g, 416, 271, 425, 280, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,425,280,416,283,404,285,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,404,285,397,283,390,278,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,278,395,287,403,295,Color.black,2f);
            GraphicsUtils.drawLine(g, 403, 295, 421, 306, Color.black, 2f);
            GraphicsUtils.drawLine(g, 421, 306, 410, 307, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,410,307,398,303,390,299,Color.black,2f);

            GraphicsUtils.drawQuadCurve(g,390,299,394,309,402,318,Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 318, 413, 327, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g,413,327,404,327,395,323,Color.black,2f);
            GraphicsUtils.drawQuadCurve(g,395,323,387,316,380,306,Color.black,2f);

            //insilde hair
            GraphicsUtils.drawQuadCurve(g,380,306,377,299,375,292,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 375, 292, 374, 285, Color.black, 1.5f);
            GraphicsUtils.drawQuadCurve(g,384,293,371,285,370,271,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,276,370,271,365,267,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,380,257,374,263,365,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 350, 267, 343, 263, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,365,267,358,268,350,267,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,363,255,352,261,343,263,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,343,263,337,262,333,260,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,242,351,250,339,257,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,339,257,333,260,325,262,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,325,262,317,261,310,259,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,338,244,324,253,310,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,310,259,301,258,296,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,322,239,314,245,302,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,302,251,296,254,290,254,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,204,278,185,308,168,317,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,228,260,204,282,183,283,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,255,256,228,260,208,259,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,255,256,248,251,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,248,251,239,247,231,237,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,253,249,246,239,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,246,239,244,231,244,222,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,261,254,267,249,274,248,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,284,249,290,254,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,274,248,269,245,263,229,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,263,229,263,221,266,212,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,271,245,276,237,278,226,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,278,226,278,216,276,207,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,283,217,286,233,284,244,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,291,231,297,217,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,284,244,299,235,312,222,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,267,186,271,177,271,168,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,316,205,328,201,339,178,Color.black,1.5f);
            GraphicsUtils.drawLine(g, 328, 201, 349, 189, Color.black, 1.5f);

            GraphicsUtils.drawQuadCurve(g,378,210,364,222,343,231,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,378,210,364,222,357,236,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,200,201,211,212,228,220,Color.black,1.5f);

            GraphicsUtils.drawQuadCurve(g,159,229,174,248,198,255,Color.black,1.5f);
            

            //colorhairshadow
            GraphicsUtils.drawQuadCurve(g,141,253,146,257,157,259,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,158,232,170,250,196,258,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,159,220,168,226,179,228,Color.decode("#BE6B63"),6f);
            GraphicsUtils.drawQuadCurve(g,201,173,212,186,226,190,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,341,181,326,203,347,186,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,198,203,213,218,230,224,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 324, 208, 350, 192,Color.decode("#BE6B63"), 5f);
            GraphicsUtils.drawQuadCurve(g,358,238,367,226,380,211,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawLine(g, 347, 232, 364, 222,Color.decode("#BE6B63"), 3f);
            GraphicsUtils.drawQuadCurve(g,170,312,186,298,198,281,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,186,278,207,273,223,262,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,250,255,232,257,213,256,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,256,254,247,248,237,239,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,250,254,247,247,236,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,268,247,264,241,261,233,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,261,233,260,222,263,214,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,271,240,275,232,275,220,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,285,245,300,238,313,226,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,240,295,228,299,218,Color.decode("#BE6B63"),5f);
            GraphicsUtils.drawQuadCurve(g,288,236,287,225,285,218,Color.decode("#BE6B63"),5f);

            GraphicsUtils.drawQuadCurve(g,300,254,313,249,325,238,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,315,259,325,255,338,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,337,260,350,255,361,246,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,348,264,357,262,364,257,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,369,268,377,265,382,259,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,373,274,376,284,387,294,Color.decode("#BE6B63"),4f);
            GraphicsUtils.drawQuadCurve(g,376,289,380,302,390,312,Color.decode("#BE6B63"),4f);
            //colorhair
            GraphicsUtils.floodFill(image, 259, 197, Color.WHITE, Color.decode("#FAB0A7"), 85);
            GraphicsUtils.drawCircle(g, 368, 191, 6, Color.white, 2f);
            GraphicsUtils.floodFill(image, 369, 193, Color.decode("#FAB0A7"), Color.white, 85);
            GraphicsUtils.drawCircle(g, 343, 206, 4, Color.white, 2f);
            GraphicsUtils.floodFill(image, 343, 203, Color.decode("#FAB0A7"), Color.white, 85);
            //colorbody
            GraphicsUtils.drawQuadCurve(g,174,381,230,384,292,372,Color.decode("#D4B563"),2f);
            GraphicsUtils.drawQuadCurve(g,292,372,335,341,355,268,Color.decode("#D4B563"),2f);  
            GraphicsUtils.floodFill(image, 275, 318, Color.white,Color.decode("#EFC966"), 100);

            GraphicsUtils.drawQuadCurve(g,380,307,353,390,317,438,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawQuadCurve(g,317,438,286,461,250,469,Color.decode("#CBA950"),2f); 
            GraphicsUtils.drawLine(g, 250, 469, 225, 467, Color.decode("#CBA950"), 2f);
            GraphicsUtils.floodFill(image, 286, 408, Color.white,Color.decode("#D4B563"), 140);

            GraphicsUtils.drawQuadCurve(g,382,378,370,413,351,452,Color.decode("#D4B563"),2f); 
            GraphicsUtils.drawQuadCurve(g,351,452,328,471,292,484,Color.decode("#D4B563"),2f); 
            GraphicsUtils.floodFill(image, 325, 455, Color.white,Color.decode("#CCAA50"), 130);

            GraphicsUtils.floodFill(image, 352, 454, Color.white,Color.decode("#EFC966"), 140);

            //mouse3
            GraphicsUtils.drawQuadCurve(g, 241, 370, 252, 370, 286, 370, Color.BLACK, 1f);
            GraphicsUtils.drawQuadCurve(g, 286, 370, 304, 366, 322, 355, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 322, 355, 316, 374, Color.black, 1f);
            GraphicsUtils.drawQuadCurve(g, 316, 374, 304, 379, 282, 382, Color.BLACK, 1f);
            GraphicsUtils.drawLine(g, 282, 382, 259, 382, Color.black, 1f);
            GraphicsUtils.drawLine(g, 259, 382, 241, 370, Color.black, 1f);
            GraphicsUtils.drawLine(g, 252, 370, 252, 378, Color.black, 1f);
            GraphicsUtils.drawLine(g, 319, 357, 313, 366, Color.black, 1f);
            GraphicsUtils.drawLine(g, 313, 366, 316, 374, Color.black, 1f);
            GraphicsUtils.floodFill(image, 316, 366, Color.decode("#D4B563"),Color.black, 110);
            GraphicsUtils.floodFill(image, 250, 373, Color.decode("#EFC966"),Color.black, 110);
            GraphicsUtils.drawQuadCurve(g, 313, 366, 307, 371, 293, 374, Color.BLACK, 0.7f);
            GraphicsUtils.drawLine(g, 281, 376, 267, 376, Color.black, 0.7f);
            GraphicsUtils.drawLine(g, 252, 374, 256, 376, Color.black, 0.7f);
            GraphicsUtils.floodFill(image, 278, 378, Color.decode("#D4B563"),Color.white, 70);
            GraphicsUtils.floodFill(image, 266, 374, Color.decode("#EFC966"),Color.white, 100);

            //legleft
            GraphicsUtils.drawQuadCurve(g, 220, 492, 220, 480, 222, 467, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 220, 492, 212, 492, 207, 495, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 207, 495, 207, 498, 210, 499, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 210, 499, 217, 499, 220, 498, Color.black,2f);
            GraphicsUtils.drawLine(g, 220, 498, 220, 492, Color.black, 2f);
            GraphicsUtils.floodFill(image, 214, 496, Color.white, Color.black, 251);
            //legright
            GraphicsUtils.drawQuadCurve(g, 352, 461, 355, 467, 356, 477, Color.black,2f);
            GraphicsUtils.drawLine(g, 356, 477, 356, 490, Color.black, 2f);
            GraphicsUtils.drawLine(g, 356, 490, 366, 490, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 366, 490, 368, 487, 366, 485, Color.black,2f);
            GraphicsUtils.drawLine(g, 366, 485, 356, 485, Color.black, 2f);
            GraphicsUtils.floodFill(image, 361, 488, Color.white, Color.black, 251);

            //tattoo 
            GraphicsUtils.drawLine(g, 257, 355, 269, 353, Color.black, 3f);
            GraphicsUtils.drawLine(g, 269, 353, 278, 344, Color.black, 3f);
            GraphicsUtils.drawLine(g, 278, 344, 288, 350, Color.black, 3f);
            GraphicsUtils.drawLine(g, 288, 350, 302, 350, Color.black, 3f);

            GraphicsUtils.drawLine(g, 264, 260, 262, 255, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 255, 254, 271, Color.black, 3f);
            GraphicsUtils.drawLine(g, 254, 271, 262, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 262, 264, 262, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 282, 260, 285, 254, Color.black, 3f);
            GraphicsUtils.drawLine(g, 285, 254, 290, 266, Color.black, 3f);
            GraphicsUtils.drawLine(g, 290, 266, 283, 264, Color.black, 3f);
            GraphicsUtils.drawLine(g, 283, 264, 283, 281, Color.black, 3f);

            GraphicsUtils.drawLine(g, 211, 338, 211, 349, Color.black, 3f);
            GraphicsUtils.drawLine(g, 211, 349, 221, 356, Color.black, 3f);
            GraphicsUtils.drawLine(g, 206, 356, 209, 362, Color.black, 3f);
            GraphicsUtils.drawLine(g, 209, 362, 221, 367, Color.black, 3f);

            GraphicsUtils.drawLine(g, 200, 360, 206, 378, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 229, 386, Color.black, 4f);
            GraphicsUtils.drawLine(g, 206, 378, 224, 423, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 224, 423, 261, 447, Color.black, 4.5f);
            GraphicsUtils.drawLine(g, 261, 430, 263, 438, Color.black, 3f);
            GraphicsUtils.drawLine(g, 263, 438, 269, 443, Color.black, 3f);

            GraphicsUtils.drawLine(g, 350, 322, 349, 331, Color.black, 3f);
            GraphicsUtils.drawLine(g, 349, 331, 341, 336, Color.black, 3f);
            GraphicsUtils.drawLine(g, 357, 331, 355, 340, Color.black, 3f);
            GraphicsUtils.drawLine(g, 355, 340, 346, 349, Color.black, 3f);

            GraphicsUtils.drawLine(g, 364, 331, 358, 352, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 339, 361, Color.black, 4f);
            GraphicsUtils.drawLine(g, 358, 352, 352, 400, Color.black, 4f);
            GraphicsUtils.drawLine(g, 352, 400, 313, 439, Color.black, 4f);

            GraphicsUtils.drawLine(g, 313, 424, 312, 432, Color.black, 3f);
            GraphicsUtils.drawLine(g, 312, 432, 305, 438, Color.black, 3f);

            //slash
            // GraphicsUtils.drawLine(g, 599, 1, -2, 601, Color.black, 7f);
            GraphicsUtils.drawLine(g, 241, 1, 353, 601, Color.black, 2.5f);

        };
    }
    private static Consumer<BufferedImage> Gojo1() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
                        //mouse 
                        GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
                        GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 108, 399, 156, 433, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 156, 433, 150, 442, 158, 445, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 158, 445, 163, 435, 156, 433, Color.black,2f);
            GraphicsUtils.floodFill(image, 156, 438, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 422, 353, 469, 376, 419, 408, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 419, 408, 428, 420, 422, 430, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 422, 430, 412, 422, 419, 408, Color.black,2f);
            GraphicsUtils.floodFill(image, 419, 415, Color.white, Color.black, 230);


        };
    }
    private static Consumer<BufferedImage> Gojo2() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtils.drawQuadCurve(g, 422, 353, 469, 376, 419, 408, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 419, 408, 428, 420, 422, 430, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 422, 430, 412, 422, 419, 408, Color.black,2f);
            GraphicsUtils.floodFill(image, 419, 415, Color.white, Color.black, 230);

        };
    }
    private static Consumer<BufferedImage> Gojo3() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 384, 338, Color.black,2f);
            

        };
    }
    private static Consumer<BufferedImage> Gojo4() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            //branch1.1 line(up)
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 379, 314, Color.black,2f);
            
        };
    }
    private static Consumer<BufferedImage> Gojo5() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            //branch1.1 line(up)
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);

            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);

            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 373, 301, Color.black,2f);
            

        };
    }
    private static Consumer<BufferedImage> Gojo6() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //branch1.1 line(up)
            GraphicsUtils.drawQuadCurve(g,0,372,16,354,32,357,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,32,357,40,349,53,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,53,354,70,346,85,361,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,85,361,103,344,120,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,120,352,132,342,144,352,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,144,352,153,348,160,354,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,160,354,164,342,171,338,Color.black,1.5f); //เชื่อม
            //branch1.2 line(down)
            GraphicsUtils.drawQuadCurve(g,0,448,8,459,17,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,454,28,460,35,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,35,452,43,462,56,452,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,452,67,462,76,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,76,456,82,464,97,460,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,97,460,105,462,113,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,113,454,126,460,134,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,134,454,144,464,163,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,163,454,172,462,181,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,181,456,193,460,200,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,200,454,206,459,211,457,Color.black,1.5f); //เชื่อม
            //branch1.3 leaf
            GraphicsUtils.drawQuadCurve(g,27,416,32,408,40,413,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,413,47,408,51,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,56,377,61,373,68,376,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,376,72,372,75,374,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,126,375,130,368,137,372,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,372,142,366,147,370,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,68,443,74,434,82,439,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,82,439,88,433,93,441,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,423,118,414,128,416,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,128,416,136,410,140,417,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,161,432,167,424,174,431,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,174,431,180,425,187,428,Color.black,1.5f);
            //branch2.1 line
            GraphicsUtils.drawQuadCurve(g,46,350,42,334,56,322,Color.black,1.5f);  //เชื่อม
            GraphicsUtils.drawQuadCurve(g,56,322,51,314,77,302,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,77,302,68,289,84,286,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,84,286,83,281,100,284,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,100,284,101,270,117,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,117,272,119,268,125,269,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawLine(g,0,334,46,334,Color.black,1.5f); //dirt   
            //branch2.2 leaf
            GraphicsUtils.drawQuadCurve(g,79,332,88,330,96,333,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,96,333,101,328,107,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,103,306,111,302,118,305,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,305,125,301,128,305,Color.black,1.5f);
            //branch3.1 line(up)
            GraphicsUtils.drawQuadCurve(g,384,341,409,338,426,351,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,426,351,440,343,451,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,451,351,463,345,476,353,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,476,353,494,348,506,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,358,519,348,529,366,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,366,545,355,562,358,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,562,358,569,346,579,351,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,579,351,584,339,600,332,Color.black,1.5f);
            //branch3.2 line(down)
            GraphicsUtils.drawQuadCurve(g,357,454,373,463,379,458,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,379,458,398,464,409,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,409,453,425,464,438,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,438,454,445,463,457,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,457,454,469,464,483,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,483,458,494,467,509,456,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,456,522,463,536,453,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,453,549,463,557,458,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,458,569,467,575,461,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,461,587,470,597,454,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,597,454,598,462,600,466,Color.black,1.5f);
            //branch3.3 leaf
            GraphicsUtils.drawQuadCurve(g,385,373,392,368,398,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,398,373,403,370,406,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,386,420,395,412,403,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,403,418,410,412,412,418,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,429,398,435,391,443,398,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,443,398,453,388,459,395,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,484,382,490,379,495,382,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,495,382,503,379,503,384,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,490,432,498,425,503,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,503,430,508,426,512,430,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,550,411,557,401,564,407,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,564,407,570,399,575,403,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,437,577,432,580,437,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,580,437,586,432,590,435,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,577,373,583,368,588,373,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,588,373,595,367,598,371,Color.black,1.5f);
            //branch4.1 up
            GraphicsUtils.drawQuadCurve(g,440,265,449,267,454,277,Color.black,1.5f); //เชื่อม
            GraphicsUtils.drawQuadCurve(g,454,277,464,267,481,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,481,270,499,261,508,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,508,272,521,265,526,272,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,526,272,536,267,552,274,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,552,274,560,266,575,270,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,575,270,588,261,600,265,Color.black,1.5f);
            //branch4.2 leaf
            GraphicsUtils.drawQuadCurve(g,437,316,443,311,452,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,452,316,459,309,463,316,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,480,289,487,285,491,289,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,491,289,495,285,499,287,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,507,331,514,326,521,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,521,331,526,327,530,331,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,297,534,290,544,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,544,293,550,288,556,293,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,574,322,579,312,585,315,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,315,591,310,595,313,Color.black,1.5f);
            //cloud 1
            GraphicsUtils.drawQuadCurve(g,0,47,6,44,17,44,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,17,44,24,35,42,47,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,42,47,63,35,75,46,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,75,46,100,40,115,62,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,62,125,56,137,65,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,137,65,162,83,150,92,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,150,92,143,110,115,113,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,115,113,97,122,78,114,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,78,114,60,125,38,118,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,38,118,17,127,0,114,Color.black,1.5f);
            //cloud 2
            GraphicsUtils.drawQuadCurve(g,294,19,296,8,320,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,320,8,335,1,351,8,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,8,377,1,388,12,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,388,12,402,10,415,19,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,415,19,419,27,410,27,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,410,27,410,42,381,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,381,40,371,50,351,45,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,351,45,339,50,332,40,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,332,40,314,45,305,31,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,305,31,284,27,294,19,Color.black,1.5f);
            //cloud 3
            GraphicsUtils.drawQuadCurve(g,600,75,595,63,585,68,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,585,68,567,60,568,63,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,568,63,559,67,555,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,555,75,547,67,542,75,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,542,75,526,71,515,85,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,515,85,499,88,505,99,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,505,99,490,101,487,109,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,487,109,490,120,509,117,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,509,117,515,126,536,120,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,536,120,542,128,557,121,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,557,121,576,123,581,112,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,581,112,594,116,600,110,Color.black,1.5f);
            //floor 1.1 dirt
            GraphicsUtils.drawQuadCurve(g,32,510,39,505,46,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,46,508,50,511,57,508,Color.black,1.5f);
            GraphicsUtils.drawLine(g,57,508,72,508,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,40,565,50,560,57,565,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,57,565,60,570,63,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,567,68,565,73,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,118,543,126,535,136,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,136,537,144,539,151,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,151,537,160,535,174,537,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,498,208,496,218,506,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,298,570,305,568,311,571,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,311,571,317,574,325,572,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,344,498,355,492,361,496,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,361,496,367,496,369,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,369,492,374,490,379,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,379,492,385,494,391,492,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,425,560,432,560,439,557,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,439,557,447,557,454,561,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,520,519,528,516,546,517,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,554,487,564,485,573,485,Color.black,1.5f);
            //floor 1.2 rock
            GraphicsUtils.drawQuadCurve(g,12,532,4,534,3,541,Color.black,1.5f); //1
            GraphicsUtils.drawQuadCurve(g,3,541,8,545,18,540,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,540,22,534,18,531,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,18,531,14,530,12,532,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,63,479,70,475,82,476,Color.black,1.5f); //2
            GraphicsUtils.drawQuadCurve(g,82,476,88,481,74,484,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,74,484,66,482,63,479,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,180,567,188,564,193,565,Color.black,1.5f); //3
            GraphicsUtils.drawQuadCurve(g,193,565,200,568,208,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,567,210,571,208,574,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,208,574,177,573,180,567,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,254,546,256,540,261,540,Color.black,1.5f); //4
            GraphicsUtils.drawQuadCurve(g,261,540,267,543,266,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,266,546,261,552,256,553,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,256,553,253,550,254,546,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,510,554,519,550,527,550,Color.black,1.5f); //5
            GraphicsUtils.drawQuadCurve(g,527,550,535,557,529,559,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,529,559,524,561,517,561,Color.black,1.5f);
            GraphicsUtils.drawLine(g,517,561,510,554,Color.black,1.5f);
            GraphicsUtils.drawLine(g,515,504,501,502,Color.black,1.5f); //6
            GraphicsUtils.drawQuadCurve(g,501,502,498,501,501,499,Color.black,1.5f); 
            GraphicsUtils.drawLine(g,501,499,506,497,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,506,497,503,495,508,490,Color.black,1.5f); 
            GraphicsUtils.drawQuadCurve(g,508,490,520,486,528,490,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,528,490,524,493,522,499,Color.black,1.5f);
            GraphicsUtils.drawQuadCurve(g,522,499,518,502,515,504,Color.black,1.5f);
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            // GraphicsUtils.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);
            GraphicsUtils.drawCubicCurve(g,325,318,340,276,392,274,402,306,Color.black,2f);

            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 291, 284, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 392, 274, Color.black,2f);
            
            //eyes
            // GraphicsUtils.drawCubicCurve(g,344,289,353,306,382,306,394,282,Color.black,2f);
            // GraphicsUtils.floodFill(image, 345, 310, Color.white,Color.decode("#98EF92"), 10);
            
        };
    }
    private static Consumer<BufferedImage> Gojo7() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            // GraphicsUtils.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);
            GraphicsUtils.drawCubicCurve(g,325,318,340,276,392,274,402,306,Color.black,2f);

            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 291, 284, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 392, 274, Color.black,2f);
            
            //eyes
            // GraphicsUtils.drawCubicCurve(g,344,289,353,306,382,306,394,282,Color.black,2f);
            // GraphicsUtils.floodFill(image, 345, 310, Color.white,Color.decode("#98EF92"), 10);
            

        };
    }
    private static Consumer<BufferedImage> Gojo8() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);

            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);

            // GraphicsUtils.drawQuadCurve(g, 325, 318, 362, 299, 402, 306, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 325, 318, 308, 280, 324, 253, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 324, 253, 358, 246, 391, 251, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 391, 251, 402, 277, 402, 306, Color.black,2f);
            // GraphicsUtils.drawCubicCurve(g,325,318,340,276,392,274,402,306,Color.black,2f);


            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 291, 284, Color.white, Color.decode("#18191E"), 200);

            // GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#6A6F81") , 2f);
            // GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#6A6F81"), 2f);
            // GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#6A6F81"),2f);
            // GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#6A6F81"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#6A6F81"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#6A6F81"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#6A6F81"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#BCC5F3"), 60);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#BCC5F3"), 60);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#68ED5F"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#98EF92"), 70);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#40C737"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#40C737"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#68ED5F"), 105);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#40C737"), 108);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#40C737"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 391, 251, Color.black,2f);
            
            //eyes
            // GraphicsUtils.drawCubicCurve(g,344,289,353,306,382,306,394,282,Color.black,2f);
            GraphicsUtils.drawCircle(g,357,282,30,Color.black,2f);
            // GraphicsUtils.floodFill(image, 345, 310, Color.white,Color.decode("#98EF92"), 10);
            


        };
    }

    private static Consumer<BufferedImage> Gojo9() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            //body
            GraphicsUtils.drawLine(g, 163, 310, 135, 316, Color.black, 2f);
            GraphicsUtils.drawLine(g, 135, 316, 156, 330, Color.black, 2f);
            GraphicsUtils.drawLine(g, 171, 320, 131, 346, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 346, 175, 363, Color.black, 2f);
            GraphicsUtils.drawLine(g, 166, 359, 131, 395, Color.black, 2f);
            GraphicsUtils.drawLine(g, 131, 395, 177, 415, Color.black, 2f);

            GraphicsUtils.drawLine(g, 177, 415, 158, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 158, 445, 188, 445, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 445, 181, 475, Color.black, 2f);
            GraphicsUtils.drawLine(g, 181, 475, 224, 461, Color.black, 2f);
            GraphicsUtils.drawLine(g, 224, 461, 219, 494, Color.black, 2f);
            GraphicsUtils.drawLine(g, 219, 494, 254, 485, Color.black, 2f);

            GraphicsUtils.drawLine(g, 254, 485, 282, 499, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 489, 282, 514, Color.black, 2f);
            GraphicsUtils.drawLine(g, 282, 514, 318, 491, Color.black, 2f);
            GraphicsUtils.drawLine(g, 313, 489, 353, 504, Color.black, 2f);
            GraphicsUtils.drawLine(g, 353, 504, 351, 472, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 351, 479, 358, 472, 360, 463, Color.black,2f);

            GraphicsUtils.drawLine(g, 351, 463, 401, 463, Color.black, 2f);
            GraphicsUtils.drawLine(g, 401, 463, 406, 455, Color.black, 2f);
            GraphicsUtils.drawLine(g, 406, 455, 388, 433, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 396, 427, 403, 437, 396, 442, Color.black,2f);
            GraphicsUtils.drawLine(g, 379, 423, 412, 430, Color.black, 2f);
            GraphicsUtils.drawLine(g, 412, 430, 399, 395, Color.black, 2f);

            GraphicsUtils.drawLine(g, 399, 395, 438, 377, Color.black, 2f);
            GraphicsUtils.drawLine(g, 438, 377, 409, 356, Color.black, 2f);
            GraphicsUtils.drawLine(g, 409, 356, 422, 353, Color.black, 2f);
            GraphicsUtils.drawLine(g, 422, 353, 411, 341, Color.black, 2f);
            GraphicsUtils.drawLine(g, 407, 344, 435, 323, Color.black, 2f);
            GraphicsUtils.drawLine(g, 435, 323, 402, 306, Color.black, 2f);

            GraphicsUtils.drawQuadCurve(g, 197, 342, 186, 346, 199, 363, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 188, 378, 175, 389, 189, 399, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 236, 413, 231, 440, 259, 422, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 395, 321, 409, 326, 395, 338, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 379, 351, 394, 376, 368, 384, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 360, 405, 371, 430, 335, 435, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 298, 458, 302, 482, 322, 455, Color.black,2f);

            //hairband 
            GraphicsUtils.drawQuadCurve(g, 160, 258, 160, 284, 163, 310, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 394, 245, 407, 276, 402, 306, Color.black,2f);
            GraphicsUtils.drawLine(g, 402, 306, 394, 313, Color.black, 2f);
            GraphicsUtils.drawLine(g, 394, 313, 325, 318, Color.black, 2f);
            GraphicsUtils.drawLine(g, 325, 318, 300, 301, Color.black, 2f);
            GraphicsUtils.drawLine(g, 300, 301, 281, 320, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 281, 320, 204, 318, 163, 310, Color.black,2f);
            GraphicsUtils.drawLine(g, 160, 258, 168, 253, Color.black, 2f);
            GraphicsUtils.drawLine(g, 168, 253, 394, 245, Color.black, 2f);
            GraphicsUtils.floodFill(image, 346, 293, Color.white, Color.decode("#18191E"), 200);

            GraphicsUtils.drawCubicCurve(g, 330, 302, 323, 283, 337, 266, 357, 260,Color.decode("#18191E") , 2f);
            GraphicsUtils.drawLine(g, 357, 260, 373, 266, Color.decode("#18191E"), 2f);
            GraphicsUtils.drawQuadCurve(g, 373, 266, 346, 277, 330, 302, Color.decode("#18191E"),2f);
            GraphicsUtils.floodFill(image, 338, 276, Color.decode("#18191E"), Color.decode("#18191E"), 90);

            GraphicsUtils.drawQuadCurve(g, 261, 299, 256, 303, 243, 308, Color.decode("#18191E"),2f);
            GraphicsUtils.drawQuadCurve(g, 243, 308, 262, 307, 261, 299, Color.decode("#18191E"),2f);
            GraphicsUtils.drawQuadCurve(g, 249, 307, 258, 305, 260, 302, Color.decode("#18191E"),4f);

            GraphicsUtils.drawQuadCurve(g, 203, 272, 236, 272, 262, 289, Color.decode("#18191E"),2f);
            GraphicsUtils.drawQuadCurve(g, 262, 289, 259, 275, 237, 258, Color.decode("#18191E"),2f);
            GraphicsUtils.drawQuadCurve(g, 237, 258, 216, 262, 203, 272, Color.decode("#18191E"),2f);
            GraphicsUtils.floodFill(image, 240, 267, Color.decode("#18191E"), Color.decode("#18191E"), 90);

            //hair 
            GraphicsUtils.drawQuadCurve(g, 399, 257, 418, 231, 428, 204, Color.black,2f);
            GraphicsUtils.drawLine(g, 428, 204, 397, 231, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 397, 231, 418, 190, 429, 154, Color.black,2f);
            GraphicsUtils.drawLine(g, 429, 154, 389, 197, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 389, 197, 397, 165, 413, 138, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 413, 138, 382, 158, 356, 185, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 356, 185, 367, 147, 359, 101, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 359, 101, 348, 136, 320, 169, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 320, 169, 331, 134, 308, 84, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 84, 301, 121, 278, 154, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 179, 278, 154, 274, 131, Color.black,2f);
            GraphicsUtils.drawLine(g, 274, 131, 253, 91, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 253, 91, 252, 139, 234, 175, Color.black,2f);
            GraphicsUtils.drawLine(g, 241, 181, 234, 175, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 234, 175, 212, 139, 204, 87, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 204, 87, 190, 112, 180, 147, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 180, 147, 180, 181, 190, 201, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 190, 201, 168, 185, 148, 149, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 148, 149, 153, 201, 168, 231, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 168, 231, 148, 217, 128, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 128, 189, 144, 241, 160, 271, Color.black,2f);

            
            
            //insidehair 
            GraphicsUtils.drawQuadCurve(g, 215, 251, 192, 233, 180, 210, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 222, 251, 204, 220, 203, 189, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 273, 249, 289, 229, 298, 190, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 308, 248, 328, 236, 344, 220, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 340, 247, 359, 231, 368, 214, Color.black,2f);
            
            //haircolorinside 
            GraphicsUtils.drawLine(g, 145, 241, 144, 220, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 144, 220, 168, 231,  Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 231, 168, 203, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 168, 203, 182, 215, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 177, 239, Color.white, Color.decode("#18191E"), 100);

            GraphicsUtils.drawQuadCurve(g, 208, 184, 217, 214, 241, 234,Color.decode("#6B7082"),1f);
            GraphicsUtils.drawLine(g, 203, 189, 208, 184, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 241, 234, 237, 199, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawQuadCurve(g, 237, 199, 249, 229, 274, 247,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 233, 241, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtils.drawQuadCurve(g, 298, 190, 316, 221, 316, 243,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 303, 232, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtils.drawLine(g, 344, 220, 354, 235, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 343, 235, Color.white, Color.decode("#18191E"), 60);

            GraphicsUtils.drawLine(g, 362, 226, 387, 210, Color.decode("#6B7082"), 1f);
            GraphicsUtils.drawLine(g, 387, 210, 399, 226, Color.decode("#6B7082"), 1f);
            GraphicsUtils.floodFill(image, 379, 232, Color.white, Color.decode("#18191E"), 120);

            GraphicsUtils.drawQuadCurve(g, 210, 247, 206, 236, 206, 220,Color.decode("#6B7082"),1f);
            GraphicsUtils.floodFill(image, 212, 244, Color.white, Color.decode("#18191E"), 180);
            //leg
            GraphicsUtils.drawQuadCurve(g, 217, 463, 212, 491, 214, 522, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 214, 522, 204, 518, 195, 525, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 195, 525, 204, 530, 214, 522, Color.black,2f);
            GraphicsUtils.floodFill(image, 204, 523, Color.white, Color.black, 230);

            GraphicsUtils.drawQuadCurve(g, 368, 463, 379, 495, 373, 528, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 373, 528, 387, 518, 398, 531, Color.black,2f);
            GraphicsUtils.drawLine(g, 398, 531, 373, 528, Color.black, 2f);
            GraphicsUtils.floodFill(image, 386, 527, Color.white, Color.black, 230);
            
            //mouse 
            GraphicsUtils.drawQuadCurve(g, 265, 371, 296, 374, 339, 363, Color.black,1.5f);
            GraphicsUtils.drawLine(g, 291, 386, 305, 384, Color.black, 1f);

            GraphicsUtils.drawQuadCurve(g, 272, 371, 294, 379, 329, 365, Color.black,1.5f);

            //colorbody 
            GraphicsUtils.drawQuadCurve(g, 355, 317, 287, 379, 171, 443, Color.decode("#18191E"),1.5f);
            GraphicsUtils.floodFill(image, 252, 361, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtils.drawQuadCurve(g, 430, 372, 377, 393, 341, 439, Color.decode("#18191E"),1.5f);
            GraphicsUtils.drawLine(g, 341, 439, 221, 481, Color.decode("#18191E"), 2f);
            GraphicsUtils.floodFill(image, 308, 421, Color.white, Color.decode("#18191E"), 180);

            GraphicsUtils.floodFill(image, 335, 473, Color.white, Color.decode("#18191E"), 180);
            GraphicsUtils.floodFill(image, 356, 424, Color.white, Color.decode("#18191E"), 180);
            //arms 
            GraphicsUtils.drawQuadCurve(g, 143, 351, 103, 425, 221, 390, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 221, 390, 217, 374, 224, 353, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 224, 353, 227, 365, 221, 390, Color.black,2f);

            GraphicsUtils.drawQuadCurve(g, 221, 390, 227, 378, 234, 384, Color.black,2f);
            GraphicsUtils.drawLine(g, 234, 384, 221, 390, Color.black, 4f);
            GraphicsUtils.floodFill(image, 221, 372, Color.decode("#98EF92"), Color.black, 180);
            
            

            GraphicsUtils.drawQuadCurve(g, 422, 353, 478, 390, 379, 314, Color.black,2f);
            
            //slash

            GraphicsUtils.drawLine(g, -15, 419, 619, 325, Color.decode("#18191E"), 2.5f);

        };
    }

    private static Consumer<BufferedImage> Gojo10() {
        return image -> {
            Graphics2D g = image.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            GraphicsUtils.drawLine(g, 110, 322, 78, 216, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 78, 216, 119, 126, 251, 121, Color.black,2f);
            GraphicsUtils.drawLine(g, 251, 121, 327, 247, Color.black, 2f);
            GraphicsUtils.drawLine(g, 110, 322, 327, 247, Color.black, 2f);
            GraphicsUtils.floodFill(image, 209, 251, Color.white, Color.black, 180);

            GraphicsUtils.drawLine(g, 163, 425, 378, 380, Color.black, 2f);
            GraphicsUtils.drawLine(g, 163, 425, 378, 380, Color.black, 2f);
            GraphicsUtils.drawLine(g, 163, 425, 188, 517, Color.black, 2f);
            GraphicsUtils.drawLine(g, 188, 517, 311, 530, Color.black, 2f);
            GraphicsUtils.drawLine(g, 311, 530, 400, 465, Color.black, 2f);
            GraphicsUtils.drawLine(g, 400, 465, 378, 380, Color.black, 2f);
            GraphicsUtils.floodFill(image, 274, 436, Color.white, Color.black, 180);
            //leg
            GraphicsUtils.drawLine(g, 227, 521, 227, 564, Color.black, 2f);
            GraphicsUtils.drawQuadCurve(g, 227, 564, 209, 564, 201, 573, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 201, 573, 218, 578, 227, 564, Color.black,2f);
            GraphicsUtils.floodFill(image, 211, 569, Color.white, Color.black, 180);

            GraphicsUtils.drawQuadCurve(g, 373, 485, 386, 523, 386, 564, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 386, 564, 400, 564, 408, 573, Color.black,2f);
            GraphicsUtils.drawQuadCurve(g, 408, 573, 392, 576, 386, 564, Color.black,2f);
            GraphicsUtils.floodFill(image, 397, 567, Color.white, Color.black, 180);

            GraphicsUtils.drawLine(g, -15, 419, 619, 325, Color.decode("#18191E"), 2.5f);

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
