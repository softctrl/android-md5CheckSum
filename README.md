# android-md5CheckSum
Just a simple library to calculate Hash MD5 from files and String on Android.

Usage:
```Java
import br.com.softctrl.io.util.MD5;
```
Then you can just do:

```Java
System.out.println(String.format("Hash MD5 for:%s is %s",
                                 "file_name",
                                 MD5.getMD5CheckSum("file_name")));
```

Just it.
