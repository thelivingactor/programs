class mobile
{
    void call()
    {
        System.out.println("make call");
    }
    void sms()
    {
        System.out.println("make sms");
    }
}
interface camera
{
    void click();
    void record();
}
interface media
{
    void audio();
    void video();
}

class SmartPhone extends mobile implements camera,media
{
    public void click()
    {
        System.out.println("capture photo");
    }
    public void record()
    {
        System.out.println("records a video");
    }
    public void audio()
    {
        System.out.println("play audio");
    }
    public void video()
    {
        System.out.println("play video");
    }
}
class InterfaceDemo2
{
    public static void main(String args[])
    {
        SmartPhone o= new SmartPhone();
        o.call();
        o.sms();
        o.audio();
        o.video();
        o.record();
        o.click();
    }
}