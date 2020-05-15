package digiplus.ma.mymusicapp;

public class CAlbum {

    private int mAlb_Image;
    private String mAlbum_Nam;
    private String mArtist_Nam;


    public CAlbum(int Alb_Image, String Album_Nam, String Artist_Nam) {
        mAlb_Image = Alb_Image;
        mAlbum_Nam = Album_Nam;
        mArtist_Nam = Artist_Nam;
    }

    public int getmAlb_Image() {
        return mAlb_Image;
    }

    public String getmAlbum_Nam() {
        return mAlbum_Nam;
    }

    public String getmArtist_Nam() {
        return mArtist_Nam;
    }
}
