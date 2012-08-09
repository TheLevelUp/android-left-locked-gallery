Left Locked Gallery
=================

Android gallery widget which has been modified to lock on the left side
of the view rather than the center. This is a good starting point for apps that need
this functionality, but may need to be modified to do what you want specifically. We
developed this specifically for the tip picker used for LevelUp:

![LevelUp Code Screen](https://lh4.ggpht.com/ewjy0oMr0Z_YF9OirUNUVGkHed22GBTw1PVt_-MaFJtF4mWSdij66hkPwPmVs-Kdf6o=h230)

Usage
============

The left locked gallery is provided as a library project, so all you need to do is reference
the library project in your main android project .

In XML:

```xml
<com.scvngr.levelup.views.gallery.Gallery
    android:id="@+id/tip_selector_gallery"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/bg_gallery"
    android:padding="0dip" />
```

Use an adapter to supply the views for the gallery.

See the Example project in the sample/ directory for usage.

Modified By
============

* Nate Roy (nateroy@thelevelup.com)


License
-------

Left Locked Gallery is available under the [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.html).