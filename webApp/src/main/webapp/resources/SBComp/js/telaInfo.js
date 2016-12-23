function getClientInfo()
{
    var clientinfo = "";
    clientinfo += "aplicativo:" + navigator.appName + "||";
    clientinfo += "versaoAplicativo:" + navigator.appVersion + "||";
    clientinfo += "tamanhoX:" + window.innerWidth + "||";
    clientinfo += "tamanhoY:" + window.innerHeight;
    (document.getElementById('contactfrm:clientinfo')).value = clientinfo;
}

getClientInfo();
enviarInfoTela();
