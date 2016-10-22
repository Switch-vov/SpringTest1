<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>发表信息</title>
        <style>
            body {
                padding: 0px;
                margin: 0px auto;
                font-size: 12px;
                width: 800px;
                height: 500px;
            }
            #formDiv {
                text-align: center;
                width: 100%;
                height: 100%;
                background: lightgray;

            }
            #formDiv div {
                margin: 0px auto;
                padding-top: 10px;
                width: 80%;
            }
            #formDiv div > span:first-child {
                display: inline-block;
                width: 30%;
                text-align: right;
                margin-right: 10px;
                height: 30px;
            }
            #formDiv div > span:last-child {
                display: inline-block;
                width: 65%;
                text-align: left;
                margin-left: 10px;
                height: 50px;
            }
            #blogContent, #blogTitle {
                width: 200px;
            }
            #blogContent {
                height: 100px;
            }
        </style>
    </head>
    <body>
        <div id="formDiv">
            <form action="${base.contextPath}/blog/publishBlog" method="post">
                <div>
                    <span>
                        <label for="blogTitle">博客标题</label>
                    </span>
                    <span>
                        <input type="text" name="blogTitle" id="blogTitle"/><br />
                    </span>
                </div>
                <div>
                    <span>
                        <label for="blogContent">博客内容</label>
                    </span>
                    <span>
                        <textarea name="blogContent" id="blogContent"></textarea><br />
                    </span>
                </div>
                <div>
                    <input type="submit" value="发表博客" />
                    <input type="reset" value="重置信息" />
                </div>
            </form>
        </div>
    </body>
</html>