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
    public partial class admin_login : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=Database1.mdf;Integrated Security=True;User Instance=True");
        

        public admin_login()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void admin_login_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                    con.Open();
                    SqlDataAdapter adapt = new SqlDataAdapter("select count(*) from tbladmin where admin_id = '" + textBox1.Text + "' and password = '" + textBox2.Text + "'", con);
                    DataTable dt = new DataTable();
                    adapt.Fill(dt);

                    if (dt.Rows[0][0].ToString() == "1")
                    {
                        adminpage ap = new adminpage();
                        ap.Show();
                        this.Hide();
                    }
                    else
                    {
                        MessageBox.Show("incorrect");
                    }
                
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            home h = new home();
            h.Show();
        }
    }
}
