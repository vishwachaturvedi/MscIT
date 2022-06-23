class salesman:
    __num = 0
    __name = ''
    __amt = 0
    __typ = ''
    __comm = 0
    

    def setdata(self):
        
        self.__num = int(input("Enter salesman number : "))
        self.__name = input("Enter salesman name : ")
        self.__amt = int(input("Enter sales amount : "))
        self.__typ = input("Enter salesman type (P/D/W) : ")

    def display_data(self):
        print("\n======Dsplay Data=======")
        print("salesman number :",self.__num)
        print("salesman name :",self.__name)
        print("salesman amount :",self.__amount)
        print("salesman type :",self.__type)

    def cal_commission(self):
        if(self.__type == "p"):
            self.__commission = (self.__amount*9)/100
            print("cpmmission : ",self.__commission)
        elif(self.__type == "w"):
            self.__commission = (self.__amount*5)/100
            print("cpmmission : ",self.__commission)
        elif(self.__type == "d"):
            self.__commission = (self.__amount*2)/100
            print("cpmmission : ",self.__commission)
        else:
            print("No commission")
        
s=salesman()
s.setdata()
s.display_data()
s.cal_commission()
