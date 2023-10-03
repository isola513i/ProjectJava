let number = prompt("กรอกเลขที่ต้องการซื้อ : ")
let random_number = Math.floor(Math.random() * 1000)
document.getElementById("random").innerHTML = random_number
if (number == random_number) {
    document.getElementById("result").innerHTML = "ยินดีด้วยคุณถูกรางวัลเลขท้าย 3 ตัว"

}
else {
    document.getElementById("result").innerHTML = "เสียใจด้วยคุณถูกหวยแดก"
}