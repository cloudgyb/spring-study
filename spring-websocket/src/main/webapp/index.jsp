<html>
<body>
<h2>Hello World!</h2>
</body>
<script>
    let url = "ws://localhost"+"/test";
    let webSocket = new WebSocket(url);
    webSocket.onopen = function () {
        console.log("open!");
        webSocket.send("test!");
    };
    webSocket.onclose = function () {
        console.log("close!")
    };
    webSocket.onmessage = function (mess) {
        console.log(mess);
    }
</script>
</html>
