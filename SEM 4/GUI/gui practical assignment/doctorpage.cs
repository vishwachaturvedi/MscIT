using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace hospital
{
    public partial class doctorpage : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=Database1.mdf;Integrated Security=True;User Instance=True");
   
        public doctorpage()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            con.Open();
            DataTable dt = new DataTable();
            SqlDataAdapter adapt = new SqlDataAdapter("select * from tblpatient where doctor_id = '"+textBox1.Text+"'",con);
            adapt.Fill(dt);
            dataGridView1.DataSource = dt;
            con.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            con.Open();
            SqlCommand cmd = new SqlCommand("update tblpwt set drug='" + textBox2.Text + "',specification='" + textBox3.Text + "',amount='" + textBox4.Text + "'where patient_id ='"+textBox5+"' ", con);
            cmd.ExecuteNonQuery();
            MessageBox.Show("data updated");
            con.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            con.Open();
            DataTable dt = new DataTable();
            SqlDataAdapter adapt = new SqlDataAdapter("select * from tblpatient where patient_id = '" + textBox6.Text + "'", con);
            adapt.Fill(dt);
            dataGridView1.DataSource = dt;
            con.Close();
        }
    }
}
