webview（网络视图）:能加载网页显示，可以将其视为一个浏览器。其中调用webview的loadurl方法，设置webview要显示不同的
网页调用不同的方法：调用互联网使用：webview.loadURL("http://baidu.com");本地文件用:webview.loadurl("file:///android_asset/test.html");
如果想点击返回键返回上一页就需要调用onKeyDown()方法，如果不调用的话点击返回默认退出软件。