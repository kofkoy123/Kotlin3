package lzr.kotlin.four

//输入设备 接口
interface InputDevice {
    fun input(any:Any)
}

//接口
interface USBInputDevice:InputDevice

interface BLEInputDevice:InputDevice

//抽象类 半成品
abstract class USBMouse (val name:String):USBInputDevice{
    override fun input(any: Any) {

    }

    override fun toString(): String {
        return name
    }
}

class LeiSheMouse:USBMouse("雷蛇鼠标")

class Computer{

    fun addUSBInputDevice(usbInputDevice: USBInputDevice){
        println("您现在插入的是 $usbInputDevice")
    }

    fun addBLEInputDevice(bleInputDevice: BLEInputDevice){
        println("您现在插入的是 $bleInputDevice")
    }
    //判断插入的是那种接口鼠标
    fun addInputDevice(inputDevice: InputDevice){
        when(inputDevice){
            is USBInputDevice ->{addUSBInputDevice(inputDevice)}
            is BLEInputDevice ->{addBLEInputDevice(inputDevice)}
            else ->{throw IllegalAccessException("你插入的设备不支持")}
        }
    }
}




fun main(args: Array<String>) {
    val computer = Computer()
    val mouse = LeiSheMouse()
    computer.addUSBInputDevice(mouse)


}